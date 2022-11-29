package hn;

import com.neovisionaries.ws.client.OpeningHandshakeException;
import com.neovisionaries.ws.client.WebSocketException;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public final n0 f36245a;

    public p(n0 n0Var) {
        this.f36245a = n0Var;
    }

    public final int a(Map<String, List<String>> map) {
        try {
            return Integer.parseInt(map.get("Content-Length").get(0));
        } catch (Exception unused) {
            return -1;
        }
    }

    public final void b(Map<String, List<String>> map, String str) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List<String> list = map.get(trim);
        if (list == null) {
            list = new ArrayList<>();
            map.put(trim, list);
        }
        list.add(trim2);
    }

    public final byte[] c(Map<String, List<String>> map, s0 s0Var) {
        int a10 = a(map);
        if (a10 <= 0) {
            return null;
        }
        try {
            byte[] bArr = new byte[a10];
            s0Var.a(bArr, a10);
            return bArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Map<String, List<String>> d(s0 s0Var, String str) throws WebSocketException {
        k0 f10 = f(s0Var);
        Map<String, List<String>> e10 = e(s0Var);
        l(f10, e10, s0Var);
        m(f10, e10);
        h(f10, e10);
        g(f10, e10, str);
        j(f10, e10);
        k(f10, e10);
        return e10;
    }

    public final Map<String, List<String>> e(s0 s0Var) throws WebSocketException {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb2 = null;
        while (true) {
            try {
                String d10 = s0Var.d();
                if (d10 == null || d10.length() == 0) {
                    break;
                }
                char charAt = d10.charAt(0);
                if (charAt != ' ' && charAt != '\t') {
                    if (sb2 != null) {
                        b(treeMap, sb2.toString());
                    }
                    sb2 = new StringBuilder(d10);
                } else if (sb2 != null) {
                    sb2.append(d10.replaceAll("^[ \t]+", " "));
                }
            } catch (IOException e10) {
                o0 o0Var = o0.HTTP_HEADER_FAILURE;
                throw new WebSocketException(o0Var, "An error occurred while HTTP header section was being read: " + e10.getMessage(), e10);
            }
        }
        if (sb2 != null) {
            b(treeMap, sb2.toString());
        }
        return treeMap;
    }

    public final k0 f(s0 s0Var) throws WebSocketException {
        try {
            String d10 = s0Var.d();
            if (d10 != null && d10.length() != 0) {
                try {
                    return new k0(d10);
                } catch (Exception unused) {
                    o0 o0Var = o0.STATUS_LINE_BAD_FORMAT;
                    throw new WebSocketException(o0Var, "The status line of the opening handshake response is badly formatted. The status line is: " + d10);
                }
            }
            throw new WebSocketException(o0.STATUS_LINE_EMPTY, "The status line of the opening handshake response is empty.");
        } catch (IOException e10) {
            o0 o0Var2 = o0.OPENING_HANDSHAKE_RESPONSE_FAILURE;
            throw new WebSocketException(o0Var2, "Failed to read an opening handshake response from the server: " + e10.getMessage(), e10);
        }
    }

    public final void g(k0 k0Var, Map<String, List<String>> map, String str) throws WebSocketException {
        List<String> list = map.get("Sec-WebSocket-Accept");
        if (list != null) {
            String str2 = list.get(0);
            try {
                if (!b.b(MessageDigest.getInstance("SHA-1").digest(t.d(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"))).equals(str2)) {
                    throw new OpeningHandshakeException(o0.UNEXPECTED_SEC_WEBSOCKET_ACCEPT_HEADER, "The value of 'Sec-WebSocket-Accept' header is different from the expected one.", k0Var, map);
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        throw new OpeningHandshakeException(o0.NO_SEC_WEBSOCKET_ACCEPT_HEADER, "The opening handshake response does not contain 'Sec-WebSocket-Accept' header.", k0Var, map);
    }

    public final void h(k0 k0Var, Map<String, List<String>> map) throws WebSocketException {
        List<String> list = map.get("Connection");
        if (list != null && list.size() != 0) {
            for (String str : list) {
                for (String str2 : str.split("\\s*,\\s*")) {
                    if ("Upgrade".equalsIgnoreCase(str2)) {
                        return;
                    }
                }
            }
            throw new OpeningHandshakeException(o0.NO_UPGRADE_IN_CONNECTION_HEADER, "'Upgrade' was not found in 'Connection' header.", k0Var, map);
        }
        throw new OpeningHandshakeException(o0.NO_CONNECTION_HEADER, "The opening handshake response does not contain 'Connection' header.", k0Var, map);
    }

    public final void i(k0 k0Var, Map<String, List<String>> map, List<p0> list) throws WebSocketException {
        p0 p0Var = null;
        for (p0 p0Var2 : list) {
            if (p0Var2 instanceof x) {
                if (p0Var != null) {
                    throw new OpeningHandshakeException(o0.EXTENSIONS_CONFLICT, String.format("'%s' extension and '%s' extension conflict with each other.", p0Var.c(), p0Var2.c()), k0Var, map);
                }
                p0Var = p0Var2;
            }
        }
    }

    public final void j(k0 k0Var, Map<String, List<String>> map) throws WebSocketException {
        String[] split;
        List<String> list = map.get("Sec-WebSocket-Extensions");
        if (list == null || list.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            for (String str2 : str.split("\\s*,\\s*")) {
                p0 e10 = p0.e(str2);
                if (e10 != null) {
                    String c10 = e10.c();
                    if (this.f36245a.o().e(c10)) {
                        e10.g();
                        arrayList.add(e10);
                    } else {
                        throw new OpeningHandshakeException(o0.UNSUPPORTED_EXTENSION, "The extension contained in the Sec-WebSocket-Extensions header is not supported: " + c10, k0Var, map);
                    }
                } else {
                    throw new OpeningHandshakeException(o0.EXTENSION_PARSE_ERROR, "The value in 'Sec-WebSocket-Extensions' failed to be parsed: " + str2, k0Var, map);
                }
            }
        }
        i(k0Var, map, arrayList);
        this.f36245a.O(arrayList);
    }

    public final void k(k0 k0Var, Map<String, List<String>> map) throws WebSocketException {
        String str;
        List<String> list = map.get("Sec-WebSocket-Protocol");
        if (list == null || (str = list.get(0)) == null || str.length() == 0) {
            return;
        }
        if (this.f36245a.o().f(str)) {
            this.f36245a.P(str);
            return;
        }
        o0 o0Var = o0.UNSUPPORTED_PROTOCOL;
        throw new OpeningHandshakeException(o0Var, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: " + str, k0Var, map);
    }

    public final void l(k0 k0Var, Map<String, List<String>> map, s0 s0Var) throws WebSocketException {
        if (k0Var.a() == 101) {
            return;
        }
        byte[] c10 = c(map, s0Var);
        o0 o0Var = o0.NOT_SWITCHING_PROTOCOLS;
        throw new OpeningHandshakeException(o0Var, "The status code of the opening handshake response is not '101 Switching Protocols'. The status line is: " + k0Var, k0Var, map, c10);
    }

    public final void m(k0 k0Var, Map<String, List<String>> map) throws WebSocketException {
        List<String> list = map.get("Upgrade");
        if (list != null && list.size() != 0) {
            for (String str : list) {
                for (String str2 : str.split("\\s*,\\s*")) {
                    if ("websocket".equalsIgnoreCase(str2)) {
                        return;
                    }
                }
            }
            throw new OpeningHandshakeException(o0.NO_WEBSOCKET_IN_UPGRADE_HEADER, "'websocket' was not found in 'Upgrade' header.", k0Var, map);
        }
        throw new OpeningHandshakeException(o0.NO_UPGRADE_HEADER, "The opening handshake response does not contain 'Upgrade' header.", k0Var, map);
    }
}
