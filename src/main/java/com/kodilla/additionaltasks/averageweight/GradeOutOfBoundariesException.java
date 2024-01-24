package com.kodilla.additionaltasks.averageweight;

import java.io.Serial;

public class GradeOutOfBoundariesException extends Exception{

    public GradeOutOfBoundariesException(String message) {
        super(message);
    }

    @Serial
    private static final long serialVersionUID = 572853345087023131L;
}
