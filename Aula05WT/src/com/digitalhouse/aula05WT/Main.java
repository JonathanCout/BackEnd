package com.digitalhouse.aula05WT;

import com.digitalhouse.aula05WT.model.Tipo;
import com.digitalhouse.aula05WT.model.Usuario;
import com.digitalhouse.aula05WT.server.impl.DownloadProxy;
import com.digitalhouse.aula05WT.server.impl.DownloadService;
import com.digitalhouse.aula05WT.server.IDownload;

public class Main {

    public static void main(String[] args) {

//        Usuário do tipo FREE
        Usuario jonathan = new Usuario("jhon", Tipo.FREE);
        IDownload downloadProxy = new DownloadProxy(new DownloadService());
        downloadProxy.baixarMusica(jonathan);


//        Upgrade da conta para PREMIUM
        jonathan.upgradeConta();
        downloadProxy.baixarMusica(jonathan);



    }
}
