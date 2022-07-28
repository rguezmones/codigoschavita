//Persona.java

import java.io.*;

public class Persona
{
	public static void main(String[] args)
	{
		Persona chava = new Persona();
		System.out.println("La persona nos dara un numero: "+ chava.personaDigaNumero());
	}

	Hello hello = new Hello();

	int personaDigaNumero()
	{
		return hello.llamarNumero();
	}
}

