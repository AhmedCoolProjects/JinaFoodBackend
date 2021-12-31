package me.ahmedbargady.jinafood.controller.admin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.ahmedbargady.jinafood.model.EmptyTable;
import me.ahmedbargady.jinafood.model.Table;
import me.ahmedbargady.jinafood.service.TableService;

@Controller
@RequestMapping("/api/v1/admin/tables")
public class TableAdminController {
	private final TableService tableService;

	public TableAdminController(TableService tableService) {
		super();
		this.tableService = tableService;
	}

	public TableService getTableService() {
		return tableService;
	}

	@GetMapping
	public String tables(Model model) {
		model.addAttribute("title", "Tables");
		model.addAttribute("tables", tableService.getall());
		return "admin/tables";
	}

	@PostMapping
	public void addTable(HttpServletRequest request, HttpServletResponse response) {
		int number = Integer.parseInt(request.getParameter("number"));
		int size = Integer.parseInt(request.getParameter("size"));
		int stage = Integer.parseInt(request.getParameter("stage"));
		EmptyTable isEmpty = EmptyTable.valueOf(request.getParameter("isEmpty"));

		Table tb = new Table(number, size, stage, isEmpty);
		tableService.add(tb);
		try {
			response.sendRedirect("/api/v1/admin/tables");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/update/{id}")
	public void updateTable(HttpServletRequest request, HttpServletResponse response, @PathVariable String id) {
		int number = Integer.parseInt(request.getParameter("number"));
		int size = Integer.parseInt(request.getParameter("size"));
		int stage = Integer.parseInt(request.getParameter("stage"));
		EmptyTable isEmpty = EmptyTable.valueOf(request.getParameter("isEmpty"));

		Table tb = new Table(number, size, stage, isEmpty);
		tb.setId(id);
		tableService.add(tb);
		try {
			response.sendRedirect("/api/v1/admin/tables");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/delete/{id}")
	public void deleteTable(HttpServletResponse response, @PathVariable String id) {
		tableService.delete(id);
		try {
			response.sendRedirect("/api/v1/admin/tables");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
