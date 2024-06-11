package com.quix.app.role;

public class Role {
    @Id
    @GeneratedValue(strategy= GenerationValue.IDENTITY)
    private Long id;
    
    private String type;    
}
