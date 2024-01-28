package br.com.alura.musicasBD.principal

import br.com.alura.musicasBD.dados.AlbumDAO
import br.com.alura.musicasBD.dados.Banco
import br.com.alura.musicasBD.dados.BandaDAO
import br.com.alura.musicasBD.dados.DAO
import br.com.alura.musicasBD.modelos.Album

import br.com.alura.musicasBD.modelos.Banda
import javax.naming.Name
import kotlin.random.Random

fun main(){


    val manager = Banco.getEntityManager()
    val AlbumDAO = AlbumDAO(manager)
    val BandaDAO = BandaDAO(manager)
    val titas = BandaDAO.recuperarPeloId(1)



//    val Disco1 = Album("Album novo", titas)
  // val Disco2 = Album("Album novo melhorado", titas)
//
//
    AlbumDAO.apagar(4)

    val listaBandas = BandaDAO.recuperarPeloId(1)
    val listaAlbum = AlbumDAO.getLista()
    println(listaBandas)
    println(listaAlbum)
    manager.close()

}

