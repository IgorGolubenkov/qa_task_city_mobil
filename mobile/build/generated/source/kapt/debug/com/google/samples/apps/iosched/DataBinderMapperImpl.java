package com.google.samples.apps.iosched;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.samples.apps.iosched.databinding.DialogSignInBindingImpl;
import com.google.samples.apps.iosched.databinding.DialogSignOutBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentAgendaBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentCodelabsBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentFeedBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentInfoBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentInfoEventBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentMapBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentOnboardingBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentOnboardingSigninBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentOnboardingWelcomeDuringBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentOnboardingWelcomePreBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentScheduleBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentScheduleFilterBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentSearchBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentSessionDetailBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentSessionFeedbackBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentSettingsBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentSpeakerBindingImpl;
import com.google.samples.apps.iosched.databinding.IncludeAgendaContentsBindingImpl;
import com.google.samples.apps.iosched.databinding.IncludeScheduleAppbarBindingImpl;
import com.google.samples.apps.iosched.databinding.IncludeScheduleAppbarBindingLandImpl;
import com.google.samples.apps.iosched.databinding.InfoWifiCardBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemAgendaDarkBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemAgendaLightBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemCodelabBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemCodelabsHeaderBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemCodelabsInformationCardBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemEventFilterBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemFeedAnnouncementBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemFeedMomentBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemFeedSessionBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemFeedSessionsContainerBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemFilterChipBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemGenericSectionHeaderBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemInlineTagBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemMapVariantBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemQuestionBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemScheduleDayIndicatorBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemSearchResultBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemSessionBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemSessionInfoBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemSpeakerBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemSpeakerInfoBindingImpl;
import com.google.samples.apps.iosched.databinding.NavigationHeaderBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_DIALOGSIGNIN = 1;

  private static final int LAYOUT_DIALOGSIGNOUT = 2;

  private static final int LAYOUT_FRAGMENTAGENDA = 3;

  private static final int LAYOUT_FRAGMENTCODELABS = 4;

  private static final int LAYOUT_FRAGMENTFEED = 5;

  private static final int LAYOUT_FRAGMENTINFO = 6;

  private static final int LAYOUT_FRAGMENTINFOEVENT = 7;

  private static final int LAYOUT_FRAGMENTMAP = 8;

  private static final int LAYOUT_FRAGMENTONBOARDING = 9;

  private static final int LAYOUT_FRAGMENTONBOARDINGSIGNIN = 10;

  private static final int LAYOUT_FRAGMENTONBOARDINGWELCOMEDURING = 11;

  private static final int LAYOUT_FRAGMENTONBOARDINGWELCOMEPRE = 12;

  private static final int LAYOUT_FRAGMENTSCHEDULE = 13;

  private static final int LAYOUT_FRAGMENTSCHEDULEFILTER = 14;

  private static final int LAYOUT_FRAGMENTSEARCH = 15;

  private static final int LAYOUT_FRAGMENTSESSIONDETAIL = 16;

  private static final int LAYOUT_FRAGMENTSESSIONFEEDBACK = 17;

  private static final int LAYOUT_FRAGMENTSETTINGS = 18;

  private static final int LAYOUT_FRAGMENTSPEAKER = 19;

  private static final int LAYOUT_INCLUDEAGENDACONTENTS = 20;

  private static final int LAYOUT_INCLUDESCHEDULEAPPBAR = 21;

  private static final int LAYOUT_INFOWIFICARD = 22;

  private static final int LAYOUT_ITEMAGENDADARK = 23;

  private static final int LAYOUT_ITEMAGENDALIGHT = 24;

  private static final int LAYOUT_ITEMCODELAB = 25;

  private static final int LAYOUT_ITEMCODELABSHEADER = 26;

  private static final int LAYOUT_ITEMCODELABSINFORMATIONCARD = 27;

  private static final int LAYOUT_ITEMEVENTFILTER = 28;

  private static final int LAYOUT_ITEMFEEDANNOUNCEMENT = 29;

  private static final int LAYOUT_ITEMFEEDMOMENT = 30;

  private static final int LAYOUT_ITEMFEEDSESSION = 31;

  private static final int LAYOUT_ITEMFEEDSESSIONSCONTAINER = 32;

  private static final int LAYOUT_ITEMFILTERCHIP = 33;

  private static final int LAYOUT_ITEMGENERICSECTIONHEADER = 34;

  private static final int LAYOUT_ITEMINLINETAG = 35;

  private static final int LAYOUT_ITEMMAPVARIANT = 36;

  private static final int LAYOUT_ITEMQUESTION = 37;

  private static final int LAYOUT_ITEMSCHEDULEDAYINDICATOR = 38;

  private static final int LAYOUT_ITEMSEARCHRESULT = 39;

  private static final int LAYOUT_ITEMSESSION = 40;

  private static final int LAYOUT_ITEMSESSIONINFO = 41;

  private static final int LAYOUT_ITEMSPEAKER = 42;

  private static final int LAYOUT_ITEMSPEAKERINFO = 43;

  private static final int LAYOUT_NAVIGATIONHEADER = 44;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(44);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.dialog_sign_in, LAYOUT_DIALOGSIGNIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.dialog_sign_out, LAYOUT_DIALOGSIGNOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_agenda, LAYOUT_FRAGMENTAGENDA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_codelabs, LAYOUT_FRAGMENTCODELABS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_feed, LAYOUT_FRAGMENTFEED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_info, LAYOUT_FRAGMENTINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_info_event, LAYOUT_FRAGMENTINFOEVENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_map, LAYOUT_FRAGMENTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_onboarding, LAYOUT_FRAGMENTONBOARDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_onboarding_signin, LAYOUT_FRAGMENTONBOARDINGSIGNIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_onboarding_welcome_during, LAYOUT_FRAGMENTONBOARDINGWELCOMEDURING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_onboarding_welcome_pre, LAYOUT_FRAGMENTONBOARDINGWELCOMEPRE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_schedule, LAYOUT_FRAGMENTSCHEDULE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_schedule_filter, LAYOUT_FRAGMENTSCHEDULEFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_session_detail, LAYOUT_FRAGMENTSESSIONDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_session_feedback, LAYOUT_FRAGMENTSESSIONFEEDBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_settings, LAYOUT_FRAGMENTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_speaker, LAYOUT_FRAGMENTSPEAKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.include_agenda_contents, LAYOUT_INCLUDEAGENDACONTENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.include_schedule_appbar, LAYOUT_INCLUDESCHEDULEAPPBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.info_wifi_card, LAYOUT_INFOWIFICARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_agenda_dark, LAYOUT_ITEMAGENDADARK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_agenda_light, LAYOUT_ITEMAGENDALIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_codelab, LAYOUT_ITEMCODELAB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_codelabs_header, LAYOUT_ITEMCODELABSHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_codelabs_information_card, LAYOUT_ITEMCODELABSINFORMATIONCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_event_filter, LAYOUT_ITEMEVENTFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_feed_announcement, LAYOUT_ITEMFEEDANNOUNCEMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_feed_moment, LAYOUT_ITEMFEEDMOMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_feed_session, LAYOUT_ITEMFEEDSESSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_feed_sessions_container, LAYOUT_ITEMFEEDSESSIONSCONTAINER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_filter_chip, LAYOUT_ITEMFILTERCHIP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_generic_section_header, LAYOUT_ITEMGENERICSECTIONHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_inline_tag, LAYOUT_ITEMINLINETAG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_map_variant, LAYOUT_ITEMMAPVARIANT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_question, LAYOUT_ITEMQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_schedule_day_indicator, LAYOUT_ITEMSCHEDULEDAYINDICATOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_search_result, LAYOUT_ITEMSEARCHRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_session, LAYOUT_ITEMSESSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_session_info, LAYOUT_ITEMSESSIONINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_speaker, LAYOUT_ITEMSPEAKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_speaker_info, LAYOUT_ITEMSPEAKERINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.navigation_header, LAYOUT_NAVIGATIONHEADER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_DIALOGSIGNIN: {
          if ("layout/dialog_sign_in_0".equals(tag)) {
            return new DialogSignInBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_sign_in is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGSIGNOUT: {
          if ("layout/dialog_sign_out_0".equals(tag)) {
            return new DialogSignOutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_sign_out is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAGENDA: {
          if ("layout/fragment_agenda_0".equals(tag)) {
            return new FragmentAgendaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_agenda is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCODELABS: {
          if ("layout/fragment_codelabs_0".equals(tag)) {
            return new FragmentCodelabsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_codelabs is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFEED: {
          if ("layout/fragment_feed_0".equals(tag)) {
            return new FragmentFeedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_feed is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINFO: {
          if ("layout/fragment_info_0".equals(tag)) {
            return new FragmentInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_info is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINFOEVENT: {
          if ("layout/fragment_info_event_0".equals(tag)) {
            return new FragmentInfoEventBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_info_event is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAP: {
          if ("layout/fragment_map_0".equals(tag)) {
            return new FragmentMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_map is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARDING: {
          if ("layout/fragment_onboarding_0".equals(tag)) {
            return new FragmentOnboardingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboarding is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARDINGSIGNIN: {
          if ("layout/fragment_onboarding_signin_0".equals(tag)) {
            return new FragmentOnboardingSigninBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboarding_signin is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARDINGWELCOMEDURING: {
          if ("layout/fragment_onboarding_welcome_during_0".equals(tag)) {
            return new FragmentOnboardingWelcomeDuringBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboarding_welcome_during is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARDINGWELCOMEPRE: {
          if ("layout/fragment_onboarding_welcome_pre_0".equals(tag)) {
            return new FragmentOnboardingWelcomePreBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboarding_welcome_pre is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCHEDULE: {
          if ("layout/fragment_schedule_0".equals(tag)) {
            return new FragmentScheduleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_schedule is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCHEDULEFILTER: {
          if ("layout/fragment_schedule_filter_0".equals(tag)) {
            return new FragmentScheduleFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_schedule_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSESSIONDETAIL: {
          if ("layout/fragment_session_detail_0".equals(tag)) {
            return new FragmentSessionDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_session_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSESSIONFEEDBACK: {
          if ("layout/fragment_session_feedback_0".equals(tag)) {
            return new FragmentSessionFeedbackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_session_feedback is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGS: {
          if ("layout/fragment_settings_0".equals(tag)) {
            return new FragmentSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPEAKER: {
          if ("layout/fragment_speaker_0".equals(tag)) {
            return new FragmentSpeakerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_speaker is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDEAGENDACONTENTS: {
          if ("layout/include_agenda_contents_0".equals(tag)) {
            return new IncludeAgendaContentsBindingImpl(component, new View[]{view});
          }
          throw new IllegalArgumentException("The tag for include_agenda_contents is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDESCHEDULEAPPBAR: {
          if ("layout/include_schedule_appbar_0".equals(tag)) {
            return new IncludeScheduleAppbarBindingImpl(component, view);
          }
          if ("layout-land/include_schedule_appbar_0".equals(tag)) {
            return new IncludeScheduleAppbarBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_schedule_appbar is invalid. Received: " + tag);
        }
        case  LAYOUT_INFOWIFICARD: {
          if ("layout/info_wifi_card_0".equals(tag)) {
            return new InfoWifiCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for info_wifi_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMAGENDADARK: {
          if ("layout/item_agenda_dark_0".equals(tag)) {
            return new ItemAgendaDarkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_agenda_dark is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMAGENDALIGHT: {
          if ("layout/item_agenda_light_0".equals(tag)) {
            return new ItemAgendaLightBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_agenda_light is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCODELAB: {
          if ("layout/item_codelab_0".equals(tag)) {
            return new ItemCodelabBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_codelab is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCODELABSHEADER: {
          if ("layout/item_codelabs_header_0".equals(tag)) {
            return new ItemCodelabsHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_codelabs_header is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCODELABSINFORMATIONCARD: {
          if ("layout/item_codelabs_information_card_0".equals(tag)) {
            return new ItemCodelabsInformationCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_codelabs_information_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMEVENTFILTER: {
          if ("layout/item_event_filter_0".equals(tag)) {
            return new ItemEventFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_event_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFEEDANNOUNCEMENT: {
          if ("layout/item_feed_announcement_0".equals(tag)) {
            return new ItemFeedAnnouncementBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_feed_announcement is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFEEDMOMENT: {
          if ("layout/item_feed_moment_0".equals(tag)) {
            return new ItemFeedMomentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_feed_moment is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFEEDSESSION: {
          if ("layout/item_feed_session_0".equals(tag)) {
            return new ItemFeedSessionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_feed_session is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFEEDSESSIONSCONTAINER: {
          if ("layout/item_feed_sessions_container_0".equals(tag)) {
            return new ItemFeedSessionsContainerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_feed_sessions_container is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFILTERCHIP: {
          if ("layout/item_filter_chip_0".equals(tag)) {
            return new ItemFilterChipBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_filter_chip is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGENERICSECTIONHEADER: {
          if ("layout/item_generic_section_header_0".equals(tag)) {
            return new ItemGenericSectionHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_generic_section_header is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMINLINETAG: {
          if ("layout/item_inline_tag_0".equals(tag)) {
            return new ItemInlineTagBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_inline_tag is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMAPVARIANT: {
          if ("layout/item_map_variant_0".equals(tag)) {
            return new ItemMapVariantBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_map_variant is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMQUESTION: {
          if ("layout/item_question_0".equals(tag)) {
            return new ItemQuestionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_question is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSCHEDULEDAYINDICATOR: {
          if ("layout/item_schedule_day_indicator_0".equals(tag)) {
            return new ItemScheduleDayIndicatorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_schedule_day_indicator is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEARCHRESULT: {
          if ("layout/item_search_result_0".equals(tag)) {
            return new ItemSearchResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_search_result is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSESSION: {
          if ("layout/item_session_0".equals(tag)) {
            return new ItemSessionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_session is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSESSIONINFO: {
          if ("layout/item_session_info_0".equals(tag)) {
            return new ItemSessionInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_session_info is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSPEAKER: {
          if ("layout/item_speaker_0".equals(tag)) {
            return new ItemSpeakerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_speaker is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSPEAKERINFO: {
          if ("layout/item_speaker_info_0".equals(tag)) {
            return new ItemSpeakerInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_speaker_info is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVIGATIONHEADER: {
          if ("layout/navigation_header_0".equals(tag)) {
            return new NavigationHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for navigation_header is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case LAYOUT_INCLUDEAGENDACONTENTS: {
          if("layout/include_agenda_contents_0".equals(tag)) {
            return new IncludeAgendaContentsBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for include_agenda_contents is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(35);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "indicator");
      sKeys.put(2, "userInfo");
      sKeys.put(3, "searchResult");
      sKeys.put(4, "tagViewPool");
      sKeys.put(5, "activityViewModel");
      sKeys.put(6, "moment");
      sKeys.put(7, "descriptionAlpha");
      sKeys.put(8, "eventListener");
      sKeys.put(9, "variant");
      sKeys.put(10, "userSession");
      sKeys.put(11, "theme");
      sKeys.put(12, "tag");
      sKeys.put(13, "showReservations");
      sKeys.put(14, "announcement");
      sKeys.put(15, "isExpanded");
      sKeys.put(16, "codelab");
      sKeys.put(17, "eventFilter");
      sKeys.put(18, "question");
      sKeys.put(19, "recyclerviewAlpha");
      sKeys.put(20, "timeZoneId");
      sKeys.put(21, "showAssistantApp");
      sKeys.put(22, "showTime");
      sKeys.put(23, "isEmpty");
      sKeys.put(24, "agenda");
      sKeys.put(25, "headshotLoadListener");
      sKeys.put(26, "isChecked");
      sKeys.put(27, "sessionContainerState");
      sKeys.put(28, "speaker");
      sKeys.put(29, "sectionHeader");
      sKeys.put(30, "viewModel");
      sKeys.put(31, "headerAlpha");
      sKeys.put(32, "mapEnabled");
      sKeys.put(33, "actionHandler");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(45);

    static {
      sKeys.put("layout/dialog_sign_in_0", com.google.samples.apps.iosched.R.layout.dialog_sign_in);
      sKeys.put("layout/dialog_sign_out_0", com.google.samples.apps.iosched.R.layout.dialog_sign_out);
      sKeys.put("layout/fragment_agenda_0", com.google.samples.apps.iosched.R.layout.fragment_agenda);
      sKeys.put("layout/fragment_codelabs_0", com.google.samples.apps.iosched.R.layout.fragment_codelabs);
      sKeys.put("layout/fragment_feed_0", com.google.samples.apps.iosched.R.layout.fragment_feed);
      sKeys.put("layout/fragment_info_0", com.google.samples.apps.iosched.R.layout.fragment_info);
      sKeys.put("layout/fragment_info_event_0", com.google.samples.apps.iosched.R.layout.fragment_info_event);
      sKeys.put("layout/fragment_map_0", com.google.samples.apps.iosched.R.layout.fragment_map);
      sKeys.put("layout/fragment_onboarding_0", com.google.samples.apps.iosched.R.layout.fragment_onboarding);
      sKeys.put("layout/fragment_onboarding_signin_0", com.google.samples.apps.iosched.R.layout.fragment_onboarding_signin);
      sKeys.put("layout/fragment_onboarding_welcome_during_0", com.google.samples.apps.iosched.R.layout.fragment_onboarding_welcome_during);
      sKeys.put("layout/fragment_onboarding_welcome_pre_0", com.google.samples.apps.iosched.R.layout.fragment_onboarding_welcome_pre);
      sKeys.put("layout/fragment_schedule_0", com.google.samples.apps.iosched.R.layout.fragment_schedule);
      sKeys.put("layout/fragment_schedule_filter_0", com.google.samples.apps.iosched.R.layout.fragment_schedule_filter);
      sKeys.put("layout/fragment_search_0", com.google.samples.apps.iosched.R.layout.fragment_search);
      sKeys.put("layout/fragment_session_detail_0", com.google.samples.apps.iosched.R.layout.fragment_session_detail);
      sKeys.put("layout/fragment_session_feedback_0", com.google.samples.apps.iosched.R.layout.fragment_session_feedback);
      sKeys.put("layout/fragment_settings_0", com.google.samples.apps.iosched.R.layout.fragment_settings);
      sKeys.put("layout/fragment_speaker_0", com.google.samples.apps.iosched.R.layout.fragment_speaker);
      sKeys.put("layout/include_agenda_contents_0", com.google.samples.apps.iosched.R.layout.include_agenda_contents);
      sKeys.put("layout/include_schedule_appbar_0", com.google.samples.apps.iosched.R.layout.include_schedule_appbar);
      sKeys.put("layout-land/include_schedule_appbar_0", com.google.samples.apps.iosched.R.layout.include_schedule_appbar);
      sKeys.put("layout/info_wifi_card_0", com.google.samples.apps.iosched.R.layout.info_wifi_card);
      sKeys.put("layout/item_agenda_dark_0", com.google.samples.apps.iosched.R.layout.item_agenda_dark);
      sKeys.put("layout/item_agenda_light_0", com.google.samples.apps.iosched.R.layout.item_agenda_light);
      sKeys.put("layout/item_codelab_0", com.google.samples.apps.iosched.R.layout.item_codelab);
      sKeys.put("layout/item_codelabs_header_0", com.google.samples.apps.iosched.R.layout.item_codelabs_header);
      sKeys.put("layout/item_codelabs_information_card_0", com.google.samples.apps.iosched.R.layout.item_codelabs_information_card);
      sKeys.put("layout/item_event_filter_0", com.google.samples.apps.iosched.R.layout.item_event_filter);
      sKeys.put("layout/item_feed_announcement_0", com.google.samples.apps.iosched.R.layout.item_feed_announcement);
      sKeys.put("layout/item_feed_moment_0", com.google.samples.apps.iosched.R.layout.item_feed_moment);
      sKeys.put("layout/item_feed_session_0", com.google.samples.apps.iosched.R.layout.item_feed_session);
      sKeys.put("layout/item_feed_sessions_container_0", com.google.samples.apps.iosched.R.layout.item_feed_sessions_container);
      sKeys.put("layout/item_filter_chip_0", com.google.samples.apps.iosched.R.layout.item_filter_chip);
      sKeys.put("layout/item_generic_section_header_0", com.google.samples.apps.iosched.R.layout.item_generic_section_header);
      sKeys.put("layout/item_inline_tag_0", com.google.samples.apps.iosched.R.layout.item_inline_tag);
      sKeys.put("layout/item_map_variant_0", com.google.samples.apps.iosched.R.layout.item_map_variant);
      sKeys.put("layout/item_question_0", com.google.samples.apps.iosched.R.layout.item_question);
      sKeys.put("layout/item_schedule_day_indicator_0", com.google.samples.apps.iosched.R.layout.item_schedule_day_indicator);
      sKeys.put("layout/item_search_result_0", com.google.samples.apps.iosched.R.layout.item_search_result);
      sKeys.put("layout/item_session_0", com.google.samples.apps.iosched.R.layout.item_session);
      sKeys.put("layout/item_session_info_0", com.google.samples.apps.iosched.R.layout.item_session_info);
      sKeys.put("layout/item_speaker_0", com.google.samples.apps.iosched.R.layout.item_speaker);
      sKeys.put("layout/item_speaker_info_0", com.google.samples.apps.iosched.R.layout.item_speaker_info);
      sKeys.put("layout/navigation_header_0", com.google.samples.apps.iosched.R.layout.navigation_header);
    }
  }
}
