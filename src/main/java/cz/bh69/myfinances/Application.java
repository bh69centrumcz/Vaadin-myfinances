package cz.bh69.myfinances;

import com.vaadin.flow.theme.aura.Aura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@StyleSheet(Aura.STYLESHEET) // Use Aura.STYLESHEET to use Aura instead
//@StyleSheet("styles.css") // Your custom styles
public class Application implements AppShellConfigurator {

    private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
