package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Locale;
import lk.r;

/* loaded from: classes3.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;
    @Deprecated
    public static final TrackSelectionParameters DEFAULT;
    public static final TrackSelectionParameters DEFAULT_WITHOUT_CONTEXT;
    public final int disabledTextTrackSelectionFlags;
    public final r<String> preferredAudioLanguages;
    public final int preferredAudioRoleFlags;
    public final r<String> preferredTextLanguages;
    public final int preferredTextRoleFlags;
    public final boolean selectUndeterminedTextLanguage;

    static {
        TrackSelectionParameters build = new Builder().build();
        DEFAULT_WITHOUT_CONTEXT = build;
        DEFAULT = build;
        CREATOR = new Parcelable.Creator<TrackSelectionParameters>() { // from class: com.google.android.exoplayer2.trackselection.TrackSelectionParameters.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TrackSelectionParameters createFromParcel(Parcel parcel) {
                return new TrackSelectionParameters(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TrackSelectionParameters[] newArray(int i10) {
                return new TrackSelectionParameters[i10];
            }
        };
    }

    public TrackSelectionParameters(r<String> rVar, int i10, r<String> rVar2, int i11, boolean z10, int i12) {
        this.preferredAudioLanguages = rVar;
        this.preferredAudioRoleFlags = i10;
        this.preferredTextLanguages = rVar2;
        this.preferredTextRoleFlags = i11;
        this.selectUndeterminedTextLanguage = z10;
        this.disabledTextTrackSelectionFlags = i12;
    }

    public static TrackSelectionParameters getDefaults(Context context) {
        return new Builder(context).build();
    }

    public Builder buildUpon() {
        return new Builder(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return this.preferredAudioLanguages.equals(trackSelectionParameters.preferredAudioLanguages) && this.preferredAudioRoleFlags == trackSelectionParameters.preferredAudioRoleFlags && this.preferredTextLanguages.equals(trackSelectionParameters.preferredTextLanguages) && this.preferredTextRoleFlags == trackSelectionParameters.preferredTextRoleFlags && this.selectUndeterminedTextLanguage == trackSelectionParameters.selectUndeterminedTextLanguage && this.disabledTextTrackSelectionFlags == trackSelectionParameters.disabledTextTrackSelectionFlags;
    }

    public int hashCode() {
        return ((((((((((this.preferredAudioLanguages.hashCode() + 31) * 31) + this.preferredAudioRoleFlags) * 31) + this.preferredTextLanguages.hashCode()) * 31) + this.preferredTextRoleFlags) * 31) + (this.selectUndeterminedTextLanguage ? 1 : 0)) * 31) + this.disabledTextTrackSelectionFlags;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.preferredAudioLanguages);
        parcel.writeInt(this.preferredAudioRoleFlags);
        parcel.writeList(this.preferredTextLanguages);
        parcel.writeInt(this.preferredTextRoleFlags);
        Util.writeBoolean(parcel, this.selectUndeterminedTextLanguage);
        parcel.writeInt(this.disabledTextTrackSelectionFlags);
    }

    /* loaded from: classes3.dex */
    public static class Builder {
        public int disabledTextTrackSelectionFlags;
        public r<String> preferredAudioLanguages;
        public int preferredAudioRoleFlags;
        public r<String> preferredTextLanguages;
        public int preferredTextRoleFlags;
        public boolean selectUndeterminedTextLanguage;

        public Builder(Context context) {
            this();
            setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
        }

        private void setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettingsV19(Context context) {
            CaptioningManager captioningManager;
            if ((Util.SDK_INT >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.preferredTextRoleFlags = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.preferredTextLanguages = r.B(Util.getLocaleLanguageTag(locale));
                }
            }
        }

        public TrackSelectionParameters build() {
            return new TrackSelectionParameters(this.preferredAudioLanguages, this.preferredAudioRoleFlags, this.preferredTextLanguages, this.preferredTextRoleFlags, this.selectUndeterminedTextLanguage, this.disabledTextTrackSelectionFlags);
        }

        public Builder setDisabledTextTrackSelectionFlags(int i10) {
            this.disabledTextTrackSelectionFlags = i10;
            return this;
        }

        public Builder setPreferredAudioLanguage(String str) {
            if (str == null) {
                return setPreferredAudioLanguages(new String[0]);
            }
            return setPreferredAudioLanguages(str);
        }

        public Builder setPreferredAudioLanguages(String... strArr) {
            r.a s10 = r.s();
            for (String str : (String[]) Assertions.checkNotNull(strArr)) {
                s10.d(Util.normalizeLanguageCode((String) Assertions.checkNotNull(str)));
            }
            this.preferredAudioLanguages = s10.e();
            return this;
        }

        public Builder setPreferredAudioRoleFlags(int i10) {
            this.preferredAudioRoleFlags = i10;
            return this;
        }

        public Builder setPreferredTextLanguage(String str) {
            if (str == null) {
                return setPreferredTextLanguages(new String[0]);
            }
            return setPreferredTextLanguages(str);
        }

        public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            if (Util.SDK_INT >= 19) {
                setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettingsV19(context);
            }
            return this;
        }

        public Builder setPreferredTextLanguages(String... strArr) {
            r.a s10 = r.s();
            for (String str : (String[]) Assertions.checkNotNull(strArr)) {
                s10.d(Util.normalizeLanguageCode((String) Assertions.checkNotNull(str)));
            }
            this.preferredTextLanguages = s10.e();
            return this;
        }

        public Builder setPreferredTextRoleFlags(int i10) {
            this.preferredTextRoleFlags = i10;
            return this;
        }

        public Builder setSelectUndeterminedTextLanguage(boolean z10) {
            this.selectUndeterminedTextLanguage = z10;
            return this;
        }

        @Deprecated
        public Builder() {
            this.preferredAudioLanguages = r.A();
            this.preferredAudioRoleFlags = 0;
            this.preferredTextLanguages = r.A();
            this.preferredTextRoleFlags = 0;
            this.selectUndeterminedTextLanguage = false;
            this.disabledTextTrackSelectionFlags = 0;
        }

        public Builder(TrackSelectionParameters trackSelectionParameters) {
            this.preferredAudioLanguages = trackSelectionParameters.preferredAudioLanguages;
            this.preferredAudioRoleFlags = trackSelectionParameters.preferredAudioRoleFlags;
            this.preferredTextLanguages = trackSelectionParameters.preferredTextLanguages;
            this.preferredTextRoleFlags = trackSelectionParameters.preferredTextRoleFlags;
            this.selectUndeterminedTextLanguage = trackSelectionParameters.selectUndeterminedTextLanguage;
            this.disabledTextTrackSelectionFlags = trackSelectionParameters.disabledTextTrackSelectionFlags;
        }
    }

    public TrackSelectionParameters(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.preferredAudioLanguages = r.u(arrayList);
        this.preferredAudioRoleFlags = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.preferredTextLanguages = r.u(arrayList2);
        this.preferredTextRoleFlags = parcel.readInt();
        this.selectUndeterminedTextLanguage = Util.readBoolean(parcel);
        this.disabledTextTrackSelectionFlags = parcel.readInt();
    }
}
