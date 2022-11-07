package com.grupo4.reto1.model.usuarios;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UsuariosPostRequest {
		@NotNull(message= "No puede ser nulo")
		@NotEmpty(message= "No puede ser nulo")
		@NotBlank(message= "No puede ser nulo")
		private String nombre;
		@NotNull(message= "No puede ser nulo")
		@NotEmpty(message= "No puede ser nulo")
		@NotBlank(message= "No puede ser nulo")
		private String apellidos;
		@NotNull(message= "No puede ser nulo")
		@NotEmpty(message= "No puede ser nulo")
		@NotBlank(message= "No puede ser nulo")
		private String email;
		@NotNull(message= "No puede ser nulo")
		@NotEmpty(message= "No puede ser nulo")
		@NotBlank(message= "No puede ser nulo")
		private String password;

		public UsuariosPostRequest() { }
		
		public UsuariosPostRequest(@NotNull(message = "No puede ser nulo") @NotEmpty(message = "No puede ser nulo") @NotBlank(message = "No puede ser nulo") String nombre,
				@NotNull @NotEmpty @NotBlank String apellidos, @NotNull(message = "No puede ser nulo") @NotEmpty(message = "No puede ser nulo") @NotBlank(message = "No puede ser nulo") String email, @NotNull(message = "No puede ser nulo") @NotEmpty(message = "No puede ser nulo") @NotBlank(message = "No puede ser nulo") String password) {
			
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.email = email;
			this.password = password;
		}
		

	

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
		
	}