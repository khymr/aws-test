package ububtu.amazonec2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ububtu.amazonec2.dao.MemberDao;

@Controller
public class MemberViewController {

    private final MemberDao memberDao;

    public MemberViewController(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @GetMapping("/settings")
    public String members(Model model) {
        model.addAttribute("members", memberDao.getAllMembers());
        return "settings";
    }
}
