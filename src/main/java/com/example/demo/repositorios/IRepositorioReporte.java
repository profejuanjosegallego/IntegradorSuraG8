package com.example.demo.repositorios;

import com.example.APISuraG8ReportesEstadisticos.modelos.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioReporte extends JpaRepository<Reporte,Integer> {



}