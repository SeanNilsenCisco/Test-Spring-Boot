package testspringbootmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import testspringbootmvc.demo.model.ContactModel;

@Controller
public class ContactController {

    @RequestMapping(value="/contact", method= RequestMethod.GET)
    public String contactGet(Model model){

        model.addAttribute("contact", new ContactModel());

        return "contact";

    }

    @RequestMapping(value="/contact/{id}", method= RequestMethod.GET)
    public String contactGet(@PathVariable("id") int theId, Model model){

        //Create a contact
        ContactModel cm = new ContactModel();
        cm.setContactId(theId);
        cm.setFirstName("Sean");
        cm.setLastName("Nilsen");

        //Add that contact to the model
        model.addAttribute("contact", cm);

        return "contact";

    }
}
