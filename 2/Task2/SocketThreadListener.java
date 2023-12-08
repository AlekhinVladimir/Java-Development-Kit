package Task2;

import java.net.Socket;

public interface SocketThreadListener {
    void onSocketStart(Socket s);

    void onSocketStop();

    void onSocketReady(Socket socket);

    void onReceiveString(Socket s, String msg);

    void onSocketException(Throwable e);
}

/**
* Socket Thread listening
* */
// @Override
// public synchronized void onSocketStart(Socket s) { listener.onMessageReceived("Clientconnected"); }

// @Override
// public synchronized void onSocketStop() { listener.onMessageReceived("Client dropped");
// }

// @Override
// public synchronized void onSocketReady(Socket socket) {listener.onMessageReceived("Client is ready"); }


// @Override
// public synchronized void onReceiveString(Socket s, String msg) {listener.onMessageReceived(msg); }

// @Override
// public void onSocketException(Throwable e) { e.printStackTrace(); }

// // Client
// @Override
// public void onSocketStart(Socket s) { log.append("Started" + "\n"); }

// @Override
// public void onSocketStop() { log.append("Stopped" + "\n"); }

// @Override
// public void onSocketReady(Socket socket) { log.append("Ready" + "\n"); }

// @Override
// public void onReceiveString(Socket s, String msg) { log.append(msg + "\n"); }

// @Override
// public void onSocketException(Throwable e) { e.printStackTrace(); }
