package billing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@ComponentScan
@Controller
@RequestMapping("/employee")
public class EmployeesController {

	private static final String VIEW = "/employee";

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		// http://localhost:8080/employee/をブラウザでアクセスした場合、本メソッドが実行されます
		// 本メソッドは/employeeを遷移先のviewとして指定しているため、/templates/employee.htmlが
		// 生成されて、ブラウザに返却されます。

		mav.setViewName(VIEW);
		return mav;
	}

}