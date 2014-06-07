/**
 *
 */
package makeclass.showclass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.blizzardtec.Vehicle;

/**
 * @author Barnaby Golden
 *
 */
public final class ShowClazz {

    /**
     * Private.
     */
    private ShowClazz() {
        super();
    }

    /**
     * @param args param
     */
    public static void main(final String[] args) {

        Vehicle vehicle = new Vehicle();

        final Method[] methods = vehicle.getClass().getMethods();

        System.out.println("METHODS: ");

        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }

        Field[] fields = vehicle.getClass().getDeclaredFields();

        System.out.println("FIELDS: ");

        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }
    }
}
