package com.digitalhouse.aula05WT.server.impl;

import com.digitalhouse.aula05WT.model.Tipo;
import com.digitalhouse.aula05WT.model.Usuario;
import com.digitalhouse.aula05WT.server.IDownload;

public class DownloadProxy implements IDownload {

    private DownloadService downloadService;

    public DownloadProxy(DownloadService downloadService) {
        this.downloadService = downloadService;
    }

    @Override
    public void baixarMusica(Usuario usuario) {
        if(usuario.getTipo() == Tipo.PREMIUM) {
            downloadService.baixarMusica(usuario);
        }else {
            System.out.printf("Desculpe %s, mas você não tem permissão para baixar músicas, Faça upgrade para PREMIUM para continuar \n",usuario.getUsername());
        }
    }
}
