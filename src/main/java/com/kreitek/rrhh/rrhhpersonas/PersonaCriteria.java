package com.kreitek.rrhh.rrhhpersonas;

public class PersonaCriteria {
    private final String nombre;

    public String getNombre() {
        return nombre;
    }

    private PersonaCriteria(PersonaCriteriaBuilder builder){
        this.nombre = builder.nombre;
    }

    public static class PersonaCriteriaBuilder {
        private String nombre="";

        public PersonaCriteriaBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        public PersonaCriteria build(){
            return new PersonaCriteria(this);
        }
    }
}
