package com.digitalhouse.aula05WT.server.impl;

import com.digitalhouse.aula05WT.model.Usuario;
import com.digitalhouse.aula05WT.server.IDownload;

public class DownloadService implements IDownload {
    @Override
    public void baixarMusica(Usuario usuario) {
        System.out.println("Música baixada para o seu dispositivo com sucesso!");
    }
}
