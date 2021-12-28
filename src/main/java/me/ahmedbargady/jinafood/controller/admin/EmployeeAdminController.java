package me.ahmedbargady.jinafood.controller.admin;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ahmedbargady.jinafood.model.Employee;
import me.ahmedbargady.jinafood.model.Gender;
import me.ahmedbargady.jinafood.service.EmployeeService;

@Controller
@RequestMapping("/api/v1/admin/employees")
public class EmployeeAdminController {
	private final EmployeeService employeeService;

	public EmployeeAdminController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	@GetMapping
	public String employees(Model model) {
		model.addAttribute("title", "Employees");
		model.addAttribute("employees", employeeService.getall());
		return "admin/employees";
	}

	@PostMapping
	public void addEmployee(HttpServletRequest request, HttpServletResponse response) {
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String gender1 = request.getParameter("gender");
		String birthday1 = request.getParameter("birthday"); // 25/12/2021
		double salary = Double.parseDouble(request.getParameter("salary"));
		Gender gender;
		if (gender1 == "Male") {
			gender = Gender.Male;
		} else {
			gender = Gender.Female;
		}
		String[] birthday2 = birthday1.split("-");
		int[] birthday3 = { 0, 0, 0 };
		for (int i = 0; i < birthday2.length; i++) {
			birthday3[i] = Integer.parseInt(birthday2[i]);
		}
		LocalDate birthday = LocalDate.of(birthday3[0], birthday3[1], birthday3[2]);

		Employee em = new Employee(first_name, last_name, email, phone, gender, salary, birthday);
		employeeService.add(em);
		try {
			response.sendRedirect("/api/v1/admin/employees");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/update/{id}")
	public void updateEmployee(HttpServletRequest request, HttpServletResponse response, @PathVariable String id) {
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String gender1 = request.getParameter("gender");
		String birthday1 = request.getParameter("birthday"); // 25/12/2021
		double salary = Double.parseDouble(request.getParameter("salary"));
		Gender gender = Gender.valueOf(gender1);
//		if (gender1 == "Female") {
//			gender = Gender.Female;
//		}
		String[] birthday2 = birthday1.split("-");
		int[] birthday3 = { 0, 0, 0 };
		for (int i = 0; i < birthday2.length; i++) {
			birthday3[i] = Integer.parseInt(birthday2[i]);
		}
		LocalDate birthday = LocalDate.of(birthday3[0], birthday3[1], birthday3[2]);

		Employee em = new Employee(first_name, last_name, email, phone, gender, salary, birthday);
		em.setId(id);
		employeeService.add(em);
		try {
			response.sendRedirect("/api/v1/admin/employees");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/delete/{id}")
	public void deleteEmployee(HttpServletResponse response, @PathVariable String id) {
		employeeService.delete(id);
		try {
			response.sendRedirect("/api/v1/admin/employees");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
