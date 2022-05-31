package com.company;

public interface ComServise {
    default String payComServices() {
        return "People who lives in the apartment pay communicat services";
    }
}
