package com.dena.showroom.flvplayback.higherLevel;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes3.dex */
public class HLSStreamEndpoint implements StreamEndpoint {

    /* renamed from: a  reason: collision with root package name */
    public final URI f26431a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Context> f26432b;

    public HLSStreamEndpoint(URI uri) {
        this(uri, null);
    }

    public static HLSStreamEndpoint fromURL(String str) {
        try {
            return new HLSStreamEndpoint(new URI(str));
        } catch (URISyntaxException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        URI uri = this.f26431a;
        URI uri2 = ((HLSStreamEndpoint) obj).f26431a;
        if (uri != null) {
            if (uri.equals(uri2)) {
                return true;
            }
        } else if (uri2 == null) {
            return true;
        }
        return false;
    }

    public Context getContext() {
        return this.f26432b.get();
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.StreamEndpoint
    public URI getURI() {
        return this.f26431a;
    }

    public int hashCode() {
        URI uri = this.f26431a;
        if (uri != null) {
            return uri.hashCode();
        }
        return 0;
    }

    public HLSStreamEndpoint(URI uri, Context context) {
        this.f26431a = uri;
        this.f26432b = new WeakReference<>(context);
    }
}
