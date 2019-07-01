package testspringbootmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String formGet(Model model){
        model.addAttribute("inputBoxDefault", "Default Value");
        return "form";
    }
    @RequestMapping(value = "/form/{id}", method = RequestMethod.GET)
    public String formGetById(@PathVariable("id") String formId, Model model){
        model.addAttribute("inputBoxDefault", formId);

        return "form";
    }
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String formPost(@RequestParam("inputBox1") String inputBox1){
        System.out.println("POST Value: " + inputBox1);

        return "form";
    }

}
