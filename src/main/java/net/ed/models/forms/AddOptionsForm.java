package net.ed.models.forms;

import net.ed.models.Options;

import javax.validation.constraints.NotNull;

/**
 * Created by melocal on 4/11/17.
 */
public class AddOptionsForm {

    @NotNull
    private int optionId;

    private Iterable<Options> options;

    public AddOptionsForm() {}

    public AddOptionsForm(Iterable<Options> options) {
        this.options = options;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int cheeseId) {
        this.optionId = optionId;
    }

    public Iterable<Options> getOptions() {
        return options;
    }

}
