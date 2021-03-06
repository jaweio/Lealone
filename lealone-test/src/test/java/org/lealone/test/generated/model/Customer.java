package org.lealone.test.generated.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.lealone.orm.Model;
import org.lealone.orm.ModelDeserializer;
import org.lealone.orm.ModelSerializer;
import org.lealone.orm.ModelTable;
import org.lealone.orm.property.PInteger;
import org.lealone.orm.property.PLong;
import org.lealone.orm.property.PString;
import org.lealone.orm.property.TQProperty;
import org.lealone.test.generated.model.Customer.CustomerDeserializer;

/**
 * Model for table 'CUSTOMER'.
 *
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@JsonSerialize(using = ModelSerializer.class)
@JsonDeserialize(using = CustomerDeserializer.class)
public class Customer extends Model<Customer> {

    public static final Customer dao = new Customer(null, true);

    public static Customer create(String url) {
        ModelTable t = new ModelTable(url, "TEST", "PUBLIC", "CUSTOMER");
        return new Customer(t);
    }

    public final PLong<Customer> id;
    public final PString<Customer> name;
    public final PString<Customer> notes;
    public final PInteger<Customer> phone;

    public Customer() {
        this(null);
    }

    private Customer(ModelTable t) {
        this(t, false);
    }

    private Customer(ModelTable t, boolean isDao) {
        super(t == null ? new ModelTable("TEST", "PUBLIC", "CUSTOMER") : t, isDao);
        super.setRoot(this);

        this.id = new PLong<>("ID", this);
        this.name = new PString<>("NAME", this);
        this.notes = new PString<>("NOTES", this);
        this.phone = new PInteger<>("PHONE", this);
        super.setTQProperties(new TQProperty[] { this.id, this.name, this.notes, this.phone });
    }

    @Override
    protected Customer newInstance(ModelTable t) {
        return new Customer(t);
    }

    static class CustomerDeserializer extends ModelDeserializer<Customer> {
        @Override
        protected Model<Customer> newModelInstance() {
            return new Customer();
        }
    }
}
