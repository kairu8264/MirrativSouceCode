package com.dena.mirrorman.net.bcsvr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import jo.h;
import jo.p;
import tp.a;

/* loaded from: classes2.dex */
public final class BcsvrSocket {
    private static final String ENCODING = "UTF-8";
    private BufferedReader mReader;
    private Socket mSocket;
    private PrintWriter mWriter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void closeQuietly(Socket socket) {
            if (socket == null) {
                return;
            }
            try {
                socket.shutdownInput();
            } catch (IOException unused) {
            }
            try {
                socket.shutdownOutput();
            } catch (IOException unused2) {
            }
            try {
                socket.close();
            } catch (IOException unused3) {
            }
        }

        public final BcsvrSocket open(BcsvrAddress bcsvrAddress) throws IOException {
            p.h(bcsvrAddress, "address");
            Socket openSocket = bcsvrAddress.openSocket();
            try {
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(openSocket.getOutputStream(), "UTF-8")), true);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openSocket.getInputStream(), "UTF-8"));
                printWriter.println("SUB\t" + bcsvrAddress.getKey());
                return new BcsvrSocket(openSocket, bufferedReader, printWriter);
            } catch (IOException e10) {
                closeQuietly(openSocket);
                throw e10;
            }
        }
    }

    public BcsvrSocket(Socket socket, BufferedReader bufferedReader, PrintWriter printWriter) {
        this.mSocket = socket;
        this.mReader = bufferedReader;
        this.mWriter = printWriter;
    }

    public static final BcsvrSocket open(BcsvrAddress bcsvrAddress) throws IOException {
        return Companion.open(bcsvrAddress);
    }

    public final void close() {
        Companion.closeQuietly(this.mSocket);
        a.b(this.mReader);
        a.c(this.mWriter);
        this.mSocket = null;
        this.mReader = null;
        this.mWriter = null;
    }

    public final boolean isOpened() {
        Socket socket = this.mSocket;
        if (socket != null) {
            p.e(socket);
            if (!socket.isClosed()) {
                return true;
            }
        }
        return false;
    }

    public final BcsvrCommand readCommand() throws IOException {
        BufferedReader bufferedReader = this.mReader;
        if (bufferedReader == null) {
            return null;
        }
        p.e(bufferedReader);
        String readLine = bufferedReader.readLine();
        if (readLine == null) {
            return null;
        }
        g9.a.g('[' + System.identityHashCode(this) + ']' + readLine + " : " + readLine.length());
        return BcsvrCommand.Companion.parse(readLine);
    }

    public final BufferedReader reader() {
        return this.mReader;
    }

    public final PrintWriter writer() {
        return this.mWriter;
    }
}
