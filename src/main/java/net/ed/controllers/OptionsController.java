package net.ed.controllers;

/*
  Inspired by LaunchCode
  Created by Edward Dupre
  Copyright 2017
 */

import net.ed.models.Options;
import net.ed.models.data.OptionsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@Controller
@RequestMapping("options")
public class OptionsController {

    @Autowired
    OptionsDao optionsDao;

    private int optionId;

    // Request path: /options
//    @RequestMapping(value = "")
//    public String index(Model model) {
//
//        System.out.println("OC.35. index()");
//
////        model.addAttribute("options", optionsDao.findAll());
//        System.out.println("OC.38. completed model.addAttribute(optionsDao.findAll())");
//        model.addAttribute("title", "My Options");
//        return "options/index";
//    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayChartsForm(Model model) {
        System.out.println("CC.45. displayAddOptionsForm()");
        model.addAttribute("title", "Chart Your Options");
        model.addAttribute(new Options());
        System.out.println("CC.48. completed model.addAttribute(new Options())");
        return "options/charts";
    }

//    @RequestMapping(value = "add", method = RequestMethod.GET)
//    public String displayAddOptionsForm(Model model) {
//        System.out.println("OC.54. displayAddOptionsForm()");
//        model.addAttribute("title", "Add Options");
//        model.addAttribute(new Options());
//        System.out.println("OC.57. completed model.addAttribute(new Options())");
//        return "options/add";
//    }

//    @RequestMapping(value = "add", method = RequestMethod.POST)
//    public String processAddOptionsForm(@ModelAttribute  @Valid Options newOptions,
//                                       Errors errors, Model model) {
//
//        if (errors.hasErrors()) {
//            System.out.println("OC.47. oops... errrrr");
//            model.addAttribute("title", "Add Options");
//            return "options/add";
//        }
//
//        System.out.println("OC.54. optionsDao.save(newOptions)");
//        optionsDao.save(newOptions);
//        return "redirect:";
//    }
//
//    @RequestMapping(value = "remove", method = RequestMethod.GET)
//    public String displayRemoveCheeseForm(Model model){
//        model.addAttribute("options", optionsDao.findAll());
//        model.addAttribute("title", "Remove Options");
//        return "options/remove";
//    }
//
//    @RequestMapping(value="remove", method = RequestMethod.POST)
//    public String processRemoveCheeseForm(Model model, @RequestParam (value="optionsIds", required=false) int[] optionsIds) {
//        for (int optionsId : optionsIds){
//            optionsDao.delete(optionsId);
//        }
//        return "redirect:";
//    }
//
//    @RequestMapping(value = "edit/{optionId}", method = RequestMethod.GET)
//    public String displayEditForm(Model model, @PathVariable int optionId){
//
//        Options theOption = optionsDao.findOne(optionId);
//        if (theOption == null){
//            return "redirect:";
//        }
//
//        model.addAttribute("options", theOption);
//        model.addAttribute("title", "Edit Option");
//        return "options/edit";
//    }
//
//    @RequestMapping(value = "edit", method = RequestMethod.POST)
//    public String processEditForm(Model model, @ModelAttribute @Valid Options options,
//                                  Errors errors, @RequestParam int optionId){
//
//        if(errors.hasErrors()){
//           model.addAttribute("options", options);
//           model.addAttribute("title", "Edit Option");
//           return "options/edit";
//        }
//
//        Options theOption = optionsDao.findOne(optionId);
//        theOption.setName(options.getName());
//        theOption.setDescription(options.getDescription());
//        optionsDao.save(theOption);
//        return "redirect:";
//    }
}
