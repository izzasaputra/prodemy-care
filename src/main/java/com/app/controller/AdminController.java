package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Donation;
import com.app.model.Event;
import com.app.model.Payment;
import com.app.service.DonationService;
import com.app.service.EventService;
import com.app.service.PaymentService;

@Controller
@RequestMapping("/admincoba")
public class AdminController extends BaseController {
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/")
    public String adminA(Model model) {
        model.addAttribute("user", "Tes");
        return "admin/index";
	}
	
	@GetMapping("/payment")
	public String getPayment(Model model) throws Exception {
		List<Payment> pay = paymentService.findAll();
		model.addAttribute("list", pay);
		return "admin/payment";
	}
	
	@Autowired
	private EventService eventService;
	@GetMapping("/kategori")
	public String getKategori(Model model) throws Exception {
		List<Event> event = eventService.findAll();
		model.addAttribute("list", event);
		return "admin/kategori";
	}
	
	@Autowired
	private DonationService donationService;
	@GetMapping("/donasi")
	public String getDonation(Model model) throws Exception {
		List<Donation> donation = donationService.findAll();
		model.addAttribute("list", donation);
		return "admin/donasi";
	}
	
	
}
