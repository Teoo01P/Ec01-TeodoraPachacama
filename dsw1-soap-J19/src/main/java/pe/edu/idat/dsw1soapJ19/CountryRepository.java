package pe.edu.idat.dsw1soapJ19;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dias;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, Dias> dia = new HashMap<>();

	@PostConstruct
	public void initData() {

		Dias lunes = new Dias();
		lunes.setName("Lunes");

		lunes.setTraducir("Monday");
		dia.put(lunes.getName(), lunes);

		Dias martes = new Dias();
		martes.setName("Martes");

		martes.setTraducir("Tuesday");
		dia.put(martes.getName(), martes);

		Dias miercoles = new Dias();
		miercoles.setName("Miercoles");

		miercoles.setTraducir("Wednesday");
		dia.put(miercoles.getName(), miercoles);

		Dias jueves = new Dias();
		jueves.setName("Jueves");

		jueves.setTraducir("Thursday");
		dia.put(jueves.getName(), jueves);

		Dias viernes = new Dias();
		viernes.setName("Viernes");

		viernes.setTraducir("Friday");
		dia.put(viernes.getName(), viernes);

		Dias sabado = new Dias();
		sabado.setName("Sabado");

		sabado.setTraducir("Saturday");
		dia.put(sabado.getName(), sabado);

		Dias domingo = new Dias();
		domingo.setName("Domingo");

		domingo.setTraducir("Sunday");
		dia.put(domingo.getName(), domingo);

	}

	public Dias findDias(String name) {
		Assert.notNull(name, "Dia invalido");
		return dia.get(name);
	}

}
