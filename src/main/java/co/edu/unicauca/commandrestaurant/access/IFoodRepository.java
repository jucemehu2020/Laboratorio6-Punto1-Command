package co.edu.unicauca.commandrestaurant.access;

import java.util.List;
import co.edu.unicauca.commandrestaurant.domain.Food;

/**
 * Interface que define los servicios de persistencia de comidas
 *
 * @author Cristian Pinto - Julio Cesar
 */
public interface IFoodRepository {

    /**
     * Buscar un cliente utilizando un socket
     *
     * @param id cedula del cliente
     * @return objeto cliente
     */
    public Food findById(int id);

    /**
     * Busca los n primeros registros
     *
     * @return lista de clientes
     */
    public List<Food> findAll();

    /**
     * Crea un Component
     *
     * @param customer cliente de la agencia de viajes
     * @return devuelve la cedula del cliente creado
     */
    public boolean create(Food customer);

    /**
     * Modifica un cliente
     *
     * @param customer cliente a ser modificado
     * @return true si lo modifica con exito, false en caso contrario
     */
    public boolean update(Food customer);

    /**
     * Eliminar un cliente
     *
     * @param food identificador del cliente a eliminar
     * @return true si lo encuentra, false de lo contrario
     */
    public boolean deleteFood(Food food);

    /**
     * Eliminar un cliente
     *
     * @param id identificador del cliente a eliminar
     */
    public void delete(int id);

}
