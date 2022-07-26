package project.placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import project.placement.model.SendCV;

@Service
public class SendCvService {
    @Autowired
    JavaMailSender javaMailSender;
    public String send_Email_Cv(SendCV emailCV){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("mahdimansourikhah@gmail.com");
        message.setTo(emailCV.getToEmail());
        message.setSubject(emailCV.getSubject());
        String s = "Grade -> "+emailCV.getGrade()+"\n"+"Major -> "+emailCV.getMajor()+"\n"+"University_Name -> "+emailCV.getUniversity_Name()+"\n"+"Job_title -> "+emailCV.getJob_title()+"\n"+"Company_name -> "+emailCV.getCompany_name()+"\n"+"Date_of_employment -> "+emailCV.getDate_of_employment()+"\n"+"Description -> "+emailCV.getDescription();
        message.setText(s);
        javaMailSender.send(message);
        return "yes";
    }
}
