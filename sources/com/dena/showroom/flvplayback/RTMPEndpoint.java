package com.dena.showroom.flvplayback;

import android.text.TextUtils;
import com.dena.showroom.flvplayback.impl.util.ImmutableCollections;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes3.dex */
public class RTMPEndpoint {
    public static final int RTMPS_DEFAULT_PORT = 443;
    public static final int RTMP_DEFAULT_PORT = 1935;
    public static final Set<String> RTMP_SCHEME_NAMES = ImmutableCollections.set("rtmp", "rtmpt", "rtmpe", "rtmps");
    public static final Set<String> RTMP_SECURE_SCHEME_NAMES = ImmutableCollections.set("rtmps");

    /* renamed from: a  reason: collision with root package name */
    public final URI f26407a;

    /* renamed from: b  reason: collision with root package name */
    public final URI f26408b;

    /* renamed from: c  reason: collision with root package name */
    public final URI f26409c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f26410d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26411e;

    public RTMPEndpoint(URI uri, URI uri2, URI uri3, boolean z10, boolean z11) {
        if (RTMP_SCHEME_NAMES.contains(uri.getScheme())) {
            this.f26407a = uri;
            this.f26408b = uri2;
            this.f26409c = uri3;
            this.f26410d = z10;
            this.f26411e = z11;
            return;
        }
        throw new IllegalArgumentException("Invalid scheme!");
    }

    public static RTMPEndpoint fromURI(URI uri, String str, boolean z10, boolean z11) {
        String[] split = uri.getPath().split("/");
        if (split.length >= 2) {
            try {
                return new RTMPEndpoint(uri, new URI(null, null, TextUtils.join("/", Arrays.asList(split).subList(1, split.length)), uri.getQuery(), uri.getFragment()), new URI(str), z10, z11);
            } catch (URISyntaxException e10) {
                throw new IllegalArgumentException("The given URL is not correct as a rtmp URL..", e10);
            }
        }
        throw new IllegalArgumentException("The given URL doesn't refer to a rtmp endpoint.");
    }

    public static RTMPEndpoint fromURL(String str, boolean z10, boolean z11) {
        try {
            return fromURL(new URI(str), z10, z11);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RTMPEndpoint rTMPEndpoint = (RTMPEndpoint) obj;
        URI uri = this.f26407a;
        if (uri == null ? rTMPEndpoint.f26407a == null : uri.equals(rTMPEndpoint.f26407a)) {
            URI uri2 = this.f26408b;
            if (uri2 == null ? rTMPEndpoint.f26408b == null : uri2.equals(rTMPEndpoint.f26408b)) {
                URI uri3 = this.f26409c;
                URI uri4 = rTMPEndpoint.f26409c;
                if (uri3 != null) {
                    if (uri3.equals(uri4)) {
                        return true;
                    }
                } else if (uri4 == null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public URI getApplication() {
        return this.f26408b;
    }

    public boolean getEnable() {
        return this.f26410d;
    }

    public int getPort() {
        int port = this.f26407a.getPort();
        return port != -1 ? port : RTMP_DEFAULT_PORT;
    }

    public InetSocketAddress getSocketAddress() {
        return new InetSocketAddress(this.f26407a.getHost(), getPort());
    }

    public URI getStream() {
        return this.f26409c;
    }

    public URI getTcUrl() {
        return this.f26407a;
    }

    public boolean getVideo() {
        return this.f26411e;
    }

    public int hashCode() {
        URI uri = this.f26407a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        URI uri2 = this.f26408b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        URI uri3 = this.f26409c;
        return hashCode2 + (uri3 != null ? uri3.hashCode() : 0);
    }

    public String toString() {
        return "RTMPEndpoint{tcUrl=" + this.f26407a + ", application=" + this.f26408b + ", stream=" + this.f26409c + '}';
    }

    public static RTMPEndpoint fromURL(URI uri, boolean z10, boolean z11) {
        String[] split = uri.getPath().split("/");
        if (split.length == 3) {
            try {
                return new RTMPEndpoint(uri.resolve(new URI(null, null, "/" + split[1], uri.getQuery(), uri.getFragment())), new URI(null, null, split[1], uri.getQuery(), uri.getFragment()), new URI(null, null, split[2], null, uri.getFragment()), z10, z11);
            } catch (URISyntaxException e10) {
                throw new IllegalArgumentException("The given URL is not correct as a rtmp URL..", e10);
            }
        }
        throw new IllegalArgumentException("The given URL doesn't refer to a rtmp endpoint.");
    }

    public static RTMPEndpoint fromURL(String str, String str2, boolean z10, boolean z11) {
        try {
            return fromURI(new URI(str), str2, z10, z11);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static RTMPEndpoint fromURL(String str, String str2, String str3, boolean z10, boolean z11) {
        try {
            return new RTMPEndpoint(new URI(str), new URI(str2), new URI(str3), z10, z11);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
