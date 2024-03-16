/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract_factory;

/**
 *
 * @author FATEC ZONA LESTE
 */


/**
 * Sabe todos os produtos do tipo abstract 
 */

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
