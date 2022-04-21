package com.company;

public class Kwadrat extends Prostokat implements MoznaWyznaczycPrzekatna {
    public Kwadrat(int i) {
        super(i);
    }
    public Kwadrat(int i, int j) {
        super(i, j);
    }

    @Override
    public boolean equals(Object o){
        if(Prostokat.class == o.getClass())
        {
            return false;
        }
        return (this == o);
    }
}
