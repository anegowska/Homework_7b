package com.infoshareacademy.web;

import com.infoshareacademy.freemarker.TemplateProvider;
import com.infoshareacademy.service.Fibonacci;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import static java.lang.Integer.valueOf;

@WebServlet("/fibonacci")
public class FibonacciServlet extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(FibonacciServlet.class);

    private static final String TEMPLATE_NAME = "fibItem";
    private static final String TEMPLATE_2_NAME = "fibonacci";

    @Inject
    private TemplateProvider templateProvider;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        resp.addHeader("Content-Type", "text/html; charset=utf-8");

        Map<String, Object> model = new HashMap<>();


        Template template = templateProvider.getTemplate(
                getServletContext(), TEMPLATE_NAME
        );

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            LOG.error("Error while processing template: ", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String item = req.getParameter("item");
        Template template;
        Integer itemParam = valueOf(item);

        Map<String, Object> model = new HashMap<>();

        List<Long> fibList = Fibonacci.getFibonacciAsList(itemParam);
        model.put("itemParam", fibList.get(itemParam));
        fibList.remove(0);
        model.put("fibList", fibList);

        template = templateProvider.getTemplate(
                getServletContext(), TEMPLATE_2_NAME
        );

        try {
            template.process(model, resp.getWriter());
        } catch (TemplateException e) {
            LOG.error("Error while processing template: ", e);
        }
    }
}


