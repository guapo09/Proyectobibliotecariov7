/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador.DAOO;

import Modelo.ClienteSistemas;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface iClienteSistemasDao {
  public boolean insertarClienteSistema(ClienteSistemas clienteSistema);
 public List<ClienteSistemas> listarClienteSistema();
 public boolean eliminarClienteSistema(ClienteSistemas clienteSistema);
 
}
