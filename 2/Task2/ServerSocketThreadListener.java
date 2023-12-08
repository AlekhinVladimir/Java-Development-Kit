package Task2;

import java.net.ServerSocket;
import java.net.Socket;

public interface ServerSocketThreadListener {
    void onServerStart();

    void onServerStop();

    void onServerSocketCreated(ServerSocket s);

    void onServerSoTimeout(ServerSocket s);

    void onSocketAccepted(ServerSocket s, Socket client);

    void onServerException(Throwable e);

    }

/**
* Server socket thread methods
* */
// @Override
// public void onServerStart() { listener.onMessageReceived("Server thread started"); }

// @Override
// public void onServerStop() { listener.onMessageReceived("Server thread stopped"); }

// @Override
// public void onServerSocketCreated(ServerSocket s) { listener.onMessageReceived("Serversocket created"); }

// @Override
// public void onServerSoTimeout(ServerSocket s) {
// // listener.onMessageReceived("Accept timeout");
// }
// @Override
// public void onSocketAccepted(ServerSocket s, Socket client) {listener.onMessageReceived("client connected"); }
// @Override
// public void onServerException(Throwable e) { e.printStackTrace(); }