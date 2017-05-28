/**
 * 
 */
package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fzb
 *
 */
@Controller
public class Hello 
{
    @RequestMapping("/hello")
    public String hello(Model model)
    {
        model.addAttribute("msg","hello springmvc!");
        return "hello";
    }
}