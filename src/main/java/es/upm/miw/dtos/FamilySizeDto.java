package es.upm.miw.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class FamilySizeDto {

    @NotNull
    private String reference;

    @NotNull
    private String description;

    @NotNull
    private String provider;

    @NotNull
    private String sizeType;

    @NotNull
    private String smallestSize;

    @NotNull
    private String largestSize;

    @NotNull
    @Min(1)
    @Max(10)
    private String step;

    @Override
    public String toString() {
        return "FamilySizeDto{" +
                "reference='" + reference + '\'' +
                ", description='" + description + '\'' +
                ", provider='" + provider + '\'' +
                ", sizeType='" + sizeType + '\'' +
                ", smallestSize='" + smallestSize + '\'' +
                ", largestSize='" + largestSize + '\'' +
                ", step='" + step + '\'' +
                '}';
    }
}
