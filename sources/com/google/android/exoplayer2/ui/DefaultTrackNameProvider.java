package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Locale;

/* loaded from: classes3.dex */
public class DefaultTrackNameProvider implements TrackNameProvider {
    private final Resources resources;

    public DefaultTrackNameProvider(Resources resources) {
        this.resources = (Resources) Assertions.checkNotNull(resources);
    }

    private String buildAudioChannelString(Format format) {
        int i10 = format.channelCount;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 6 || i10 == 7) {
                    return this.resources.getString(R.string.exo_track_surround_5_point_1);
                }
                if (i10 != 8) {
                    return this.resources.getString(R.string.exo_track_surround);
                }
                return this.resources.getString(R.string.exo_track_surround_7_point_1);
            }
            return this.resources.getString(R.string.exo_track_stereo);
        }
        return this.resources.getString(R.string.exo_track_mono);
    }

    private String buildBitrateString(Format format) {
        int i10 = format.bitrate;
        return i10 == -1 ? "" : this.resources.getString(R.string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    private String buildLabelString(Format format) {
        return TextUtils.isEmpty(format.label) ? "" : format.label;
    }

    private String buildLanguageOrLabelString(Format format) {
        String joinWithSeparator = joinWithSeparator(buildLanguageString(format), buildRoleString(format));
        return TextUtils.isEmpty(joinWithSeparator) ? buildLabelString(format) : joinWithSeparator;
    }

    private String buildLanguageString(Format format) {
        String str = format.language;
        if (TextUtils.isEmpty(str) || C.LANGUAGE_UNDETERMINED.equals(str)) {
            return "";
        }
        return (Util.SDK_INT >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    private String buildResolutionString(Format format) {
        int i10 = format.width;
        int i11 = format.height;
        return (i10 == -1 || i11 == -1) ? "" : this.resources.getString(R.string.exo_track_resolution, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String buildRoleString(Format format) {
        String string = (format.roleFlags & 2) != 0 ? this.resources.getString(R.string.exo_track_role_alternate) : "";
        if ((format.roleFlags & 4) != 0) {
            string = joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((format.roleFlags & 8) != 0) {
            string = joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_commentary));
        }
        return (format.roleFlags & 1088) != 0 ? joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    private static int inferPrimaryTrackType(Format format) {
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }

    private String joinWithSeparator(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.resources.getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }

    @Override // com.google.android.exoplayer2.ui.TrackNameProvider
    public String getTrackName(Format format) {
        String buildLanguageOrLabelString;
        int inferPrimaryTrackType = inferPrimaryTrackType(format);
        if (inferPrimaryTrackType == 2) {
            buildLanguageOrLabelString = joinWithSeparator(buildRoleString(format), buildResolutionString(format), buildBitrateString(format));
        } else if (inferPrimaryTrackType == 1) {
            buildLanguageOrLabelString = joinWithSeparator(buildLanguageOrLabelString(format), buildAudioChannelString(format), buildBitrateString(format));
        } else {
            buildLanguageOrLabelString = buildLanguageOrLabelString(format);
        }
        return buildLanguageOrLabelString.length() == 0 ? this.resources.getString(R.string.exo_track_unknown) : buildLanguageOrLabelString;
    }
}
