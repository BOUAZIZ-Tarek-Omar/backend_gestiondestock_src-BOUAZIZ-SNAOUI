package com.bouaziz.gestiondestock.services;

import com.bouaziz.gestiondestock.dto.ArticleDto;
import com.bouaziz.gestiondestock.dto.LigneCommandeClientDto;
import com.bouaziz.gestiondestock.dto.LigneCommandeFournisseurDto;
import com.bouaziz.gestiondestock.dto.LigneVenteDto;
import java.util.List;

public interface ArticleService {

  ArticleDto save(ArticleDto dto);

  ArticleDto findById(Integer id);

  ArticleDto findByCodeArticle(String codeArticle);

  List<ArticleDto> findAll();

  List<LigneVenteDto> findHistoriqueVentes(Integer idArticle);

  List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle);

  List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle);

  List<ArticleDto> findAllArticleByIdCategory(Integer idCategory);

  void delete(Integer id);

}
