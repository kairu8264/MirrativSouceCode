package com.mirrativ.llstream;

import android.util.Log;
import jo.h;
import jo.p;
import so.m;
import so.n;
import so.q;

/* loaded from: classes4.dex */
public final class LLStreamKey {
    public static final Companion Companion = new Companion(null);
    private final int AvailableFeatureVersion;
    private String dist;
    private LLStreamKeyFeatureVersion featureVersion;
    private LLStreamKeyFeatures features;
    private int shardID;
    private final String value;
    private String version;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final LLStreamKey parse(String str) {
            p.h(str, "streamKey");
            LLStreamKey lLStreamKey = new LLStreamKey(str, null);
            if (lLStreamKey.isValid()) {
                return lLStreamKey;
            }
            if (lLStreamKey.getValue$llstream_release().length() != 64) {
                Log.e("LLStreamKey", "invalid length " + str);
                return null;
            } else if (!n.C(lLStreamKey.getValue$llstream_release(), "v", false, 2, null)) {
                Log.e("LLStreamKey", "invalid version " + str);
                return null;
            } else if (lLStreamKey.getShardID() < 1) {
                Log.e("LLStreamKey", "invalid shard " + str);
                return null;
            } else {
                Log.e("LLStreamKey", "invalid streamKey " + str);
                return null;
            }
        }
    }

    private LLStreamKey(String str) {
        this.AvailableFeatureVersion = 1;
        this.value = str;
        this.version = "";
        if (str.length() != 64) {
            this.dist = "";
            this.features = new LLStreamKeyFeatures(0);
            this.featureVersion = new LLStreamKeyFeatureVersion("");
            this.shardID = -1;
            return;
        }
        if (n.C(str, "v", false, 2, null)) {
            String substring = str.substring(0, 2);
            p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.version = substring;
        }
        String substring2 = q.M0(str, 2).substring(0, 2);
        p.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        this.dist = substring2;
        String substring3 = q.N0(q.M0(str, 4), 4).substring(0, 5);
        p.g(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
        this.features = new LLStreamKeyFeatures(0);
        this.featureVersion = new LLStreamKeyFeatureVersion("");
        if (n.C(substring3, "x", false, 2, null)) {
            this.featureVersion = new LLStreamKeyFeatureVersion(q.N0(substring3, 3));
            this.features = LLStreamKeyFeatures.Companion.fromHexString$llstream_release(q.M0(substring3, 2));
        }
        String M0 = q.M0(str, 60);
        this.shardID = -1;
        if (n.C(M0, "s", false, 2, null)) {
            Integer i10 = m.i(q.M0(M0, 1));
            this.shardID = i10 != null ? i10.intValue() : -1;
        }
    }

    public /* synthetic */ LLStreamKey(String str, h hVar) {
        this(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid() {
        return this.value.length() == 64 && n.C(this.value, "v", false, 2, null) && this.featureVersion.getRawValue$llstream_release() != -1 && n.C(this.featureVersion.getVersionString$llstream_release(), "x", false, 2, null) && this.shardID > 0;
    }

    public final int getAvailableFeatureVersion$llstream_release() {
        return this.AvailableFeatureVersion;
    }

    public final String getDist() {
        return this.dist;
    }

    public final LLStreamKeyFeatureVersion getFeatureVersion() {
        return this.featureVersion;
    }

    public final LLStreamKeyFeatures getFeatures() {
        return this.features;
    }

    public final int getShardID() {
        return this.shardID;
    }

    public final String getValue$llstream_release() {
        return this.value;
    }

    public final String getVersion() {
        return this.version;
    }

    public final boolean hasFeature(LLStreamKeyFeatures lLStreamKeyFeatures) {
        p.h(lLStreamKeyFeatures, "feature");
        if (isValid() && this.featureVersion.getRawValue$llstream_release() == this.AvailableFeatureVersion) {
            return this.features.contains(lLStreamKeyFeatures);
        }
        return false;
    }
}
