package com.negocio.basicas.entidades;

import com.negocio.basicas.AtaqueAbstrato;
import com.negocio.basicas.AtaqueMagico;
import com.negocio.exceptions.AcaoInvalidaException;
import com.negocio.exceptions.RPGException;
import com.negocio.interfaces.Magico;

public abstract class JogadorMagico extends EntidadeMagica implements Magico {
}
