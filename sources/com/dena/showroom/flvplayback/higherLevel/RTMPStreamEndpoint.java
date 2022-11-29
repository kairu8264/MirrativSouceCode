package com.dena.showroom.flvplayback.higherLevel;

import com.dena.showroom.flvplayback.RTMPEndpoint;
import java.net.URI;

/* loaded from: classes3.dex */
public class RTMPStreamEndpoint implements StreamEndpoint {

    /* renamed from: a  reason: collision with root package name */
    public final RTMPEndpoint f26485a;

    public RTMPStreamEndpoint(RTMPEndpoint rTMPEndpoint) {
        this.f26485a = rTMPEndpoint;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RTMPEndpoint rTMPEndpoint = this.f26485a;
        RTMPEndpoint rTMPEndpoint2 = ((RTMPStreamEndpoint) obj).f26485a;
        if (rTMPEndpoint != null) {
            if (rTMPEndpoint.equals(rTMPEndpoint2)) {
                return true;
            }
        } else if (rTMPEndpoint2 == null) {
            return true;
        }
        return false;
    }

    public RTMPEndpoint getEndpoint() {
        return this.f26485a;
    }

    @Override // com.dena.showroom.flvplayback.higherLevel.StreamEndpoint
    public URI getURI() {
        return this.f26485a.getTcUrl();
    }

    public int hashCode() {
        RTMPEndpoint rTMPEndpoint = this.f26485a;
        if (rTMPEndpoint != null) {
            return rTMPEndpoint.hashCode();
        }
        return 0;
    }

    public RTMPStreamEndpoint(URI uri, boolean z10, boolean z11) {
        this(RTMPEndpoint.fromURL(uri, z10, z11));
    }

    public RTMPStreamEndpoint(String str, String str2, boolean z10, boolean z11) {
        this(RTMPEndpoint.fromURL(str, str2, z10, z11));
    }
}
