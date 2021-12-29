package com.example.displayamap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Define un objeto de entorno de ejucion de ArcGIS

 */
import com.esri.arcgisruntime.ArcGISRuntimeEnvironment

/**
 * Un ArcGISMap contiene capas de datos cartográficos, así como otra información que define las capacidades de los mapas (por ejemplo, mapas base, ventanas emergentes, renderizadores, etiquetas, etc.).
 * Un mapa se puede visualizar en un MapView y también se puede utilizar solo para acceder a los datos.

 */
import com.esri.arcgisruntime.mapping.ArcGISMap

/**
 * Contiene los distintos estilos de mapas
 */

import com.esri.arcgisruntime.mapping.BasemapStyle

/**
 * Un punto de vista es el área visible y la ubicación de la vista de un GeoView.
 */

import com.esri.arcgisruntime.mapping.Viewpoint

/**
 * Proporciona interfaces y clases para trabajar con elementos de vista de un ArcGISMap.
 * Un MapView procesa los datos desde un ArcGISMap diseño de Android y permite a los usuarios interactuar con el mapa.
 */

import com.esri.arcgisruntime.mapping.view.MapView
import com.example.displayamap.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setApiKeyForApp()
        setContentView(activityMainBinding.root)
        setupMap()
    }

    private val activityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val mapView: MapView by lazy {
        activityMainBinding.mapView
    }

    private fun setupMap(){
        val map = ArcGISMap(BasemapStyle.ARCGIS_TOPOGRAPHIC)

        mapView.map = map

        mapView.setViewpoint(Viewpoint(6.343827, -75.507276,5000.0))
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun setApiKeyForApp(){
        ArcGISRuntimeEnvironment.setApiKey("AAPK2446fb324efb45f3b6c18d2ad044e3733tPqjZry6nJosG__6k7KY54t24WqM0-qkciblSpcLbbzx_jFgT6LjF6MJx-qC8eN")
    }
}