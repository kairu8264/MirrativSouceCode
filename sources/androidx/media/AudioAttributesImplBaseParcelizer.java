package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f15645a = versionedParcel.p(audioAttributesImplBase.f15645a, 1);
        audioAttributesImplBase.f15646b = versionedParcel.p(audioAttributesImplBase.f15646b, 2);
        audioAttributesImplBase.f15647c = versionedParcel.p(audioAttributesImplBase.f15647c, 3);
        audioAttributesImplBase.f15648d = versionedParcel.p(audioAttributesImplBase.f15648d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.f15645a, 1);
        versionedParcel.F(audioAttributesImplBase.f15646b, 2);
        versionedParcel.F(audioAttributesImplBase.f15647c, 3);
        versionedParcel.F(audioAttributesImplBase.f15648d, 4);
    }
}
