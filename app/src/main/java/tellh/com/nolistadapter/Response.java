package tellh.com.nolistadapter;

import java.util.List;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class Response {

    private List<User> items;

    public List<User> getItems() {
        return items;
    }

    public void setItems(List<User> items) {
        this.items = items;
    }

    public static String responseJsonPage1 = "{\"items\": [\n" +
            "    {\n" +
            "      \"login\": \"JakeWharton\",\n" +
            "      \"id\": 66577,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/66577?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/JakeWharton\",\n" +
            "      \"html_url\": \"https://github.com/JakeWharton\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/JakeWharton/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/JakeWharton/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/JakeWharton/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/JakeWharton/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/JakeWharton/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/JakeWharton/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/JakeWharton/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/JakeWharton/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"Trinea\",\n" +
            "      \"id\": 1169522,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/1169522?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/Trinea\",\n" +
            "      \"html_url\": \"https://github.com/Trinea\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/Trinea/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/Trinea/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/Trinea/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/Trinea/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/Trinea/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/Trinea/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/Trinea/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/Trinea/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/Trinea/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"chrisbanes\",\n" +
            "      \"id\": 227486,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/227486?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/chrisbanes\",\n" +
            "      \"html_url\": \"https://github.com/chrisbanes\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/chrisbanes/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/chrisbanes/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/chrisbanes/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/chrisbanes/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/chrisbanes/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/chrisbanes/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/chrisbanes/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/chrisbanes/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/chrisbanes/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"romannurik\",\n" +
            "      \"id\": 100155,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/100155?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/romannurik\",\n" +
            "      \"html_url\": \"https://github.com/romannurik\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/romannurik/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/romannurik/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/romannurik/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/romannurik/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/romannurik/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/romannurik/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/romannurik/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/romannurik/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/romannurik/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"koush\",\n" +
            "      \"id\": 73924,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/73924?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/koush\",\n" +
            "      \"html_url\": \"https://github.com/koush\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/koush/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/koush/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/koush/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/koush/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/koush/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/koush/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/koush/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/koush/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/koush/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"commonsguy\",\n" +
            "      \"id\": 103772,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/103772?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/commonsguy\",\n" +
            "      \"html_url\": \"https://github.com/commonsguy\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/commonsguy/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/commonsguy/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/commonsguy/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/commonsguy/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/commonsguy/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/commonsguy/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/commonsguy/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/commonsguy/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/commonsguy/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"hongyangAndroid\",\n" +
            "      \"id\": 10704521,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/10704521?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/hongyangAndroid\",\n" +
            "      \"html_url\": \"https://github.com/hongyangAndroid\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/hongyangAndroid/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/hongyangAndroid/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/hongyangAndroid/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/hongyangAndroid/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/hongyangAndroid/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/hongyangAndroid/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/hongyangAndroid/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/hongyangAndroid/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/hongyangAndroid/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"romainguy\",\n" +
            "      \"id\": 869684,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/869684?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/romainguy\",\n" +
            "      \"html_url\": \"https://github.com/romainguy\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/romainguy/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/romainguy/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/romainguy/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/romainguy/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/romainguy/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/romainguy/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/romainguy/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/romainguy/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/romainguy/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"singwhatiwanna\",\n" +
            "      \"id\": 3346272,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/3346272?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/singwhatiwanna\",\n" +
            "      \"html_url\": \"https://github.com/singwhatiwanna\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/singwhatiwanna/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/singwhatiwanna/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/singwhatiwanna/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/singwhatiwanna/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/singwhatiwanna/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/singwhatiwanna/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/singwhatiwanna/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/singwhatiwanna/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/singwhatiwanna/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"kevinsawicki\",\n" +
            "      \"id\": 671378,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/671378?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/kevinsawicki\",\n" +
            "      \"html_url\": \"https://github.com/kevinsawicki\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/kevinsawicki/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/kevinsawicki/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/kevinsawicki/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/kevinsawicki/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/kevinsawicki/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/kevinsawicki/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/kevinsawicki/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/kevinsawicki/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/kevinsawicki/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": true,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"cyrilmottier\",\n" +
            "      \"id\": 92794,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/92794?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/cyrilmottier\",\n" +
            "      \"html_url\": \"https://github.com/cyrilmottier\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/cyrilmottier/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/cyrilmottier/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/cyrilmottier/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/cyrilmottier/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/cyrilmottier/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/cyrilmottier/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/cyrilmottier/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/cyrilmottier/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/cyrilmottier/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"jgilfelt\",\n" +
            "      \"id\": 175697,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/175697?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/jgilfelt\",\n" +
            "      \"html_url\": \"https://github.com/jgilfelt\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/jgilfelt/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/jgilfelt/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/jgilfelt/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/jgilfelt/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/jgilfelt/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/jgilfelt/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/jgilfelt/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/jgilfelt/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/jgilfelt/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"greenrobot\",\n" +
            "      \"id\": 242242,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/242242?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/greenrobot\",\n" +
            "      \"html_url\": \"https://github.com/greenrobot\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/greenrobot/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/greenrobot/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/greenrobot/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/greenrobot/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/greenrobot/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/greenrobot/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/greenrobot/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/greenrobot/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/greenrobot/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"drakeet\",\n" +
            "      \"id\": 5214214,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/5214214?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/drakeet\",\n" +
            "      \"html_url\": \"https://github.com/drakeet\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/drakeet/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/drakeet/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/drakeet/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/drakeet/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/drakeet/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/drakeet/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/drakeet/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/drakeet/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/drakeet/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"unclebob\",\n" +
            "      \"id\": 36901,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/36901?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/unclebob\",\n" +
            "      \"html_url\": \"https://github.com/unclebob\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/unclebob/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/unclebob/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/unclebob/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/unclebob/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/unclebob/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/unclebob/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/unclebob/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/unclebob/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/unclebob/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"rengwuxian\",\n" +
            "      \"id\": 4454687,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/4454687?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/rengwuxian\",\n" +
            "      \"html_url\": \"https://github.com/rengwuxian\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/rengwuxian/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/rengwuxian/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/rengwuxian/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/rengwuxian/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/rengwuxian/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/rengwuxian/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/rengwuxian/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/rengwuxian/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/rengwuxian/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"rovo89\",\n" +
            "      \"id\": 1573299,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/1573299?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/rovo89\",\n" +
            "      \"html_url\": \"https://github.com/rovo89\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/rovo89/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/rovo89/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/rovo89/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/rovo89/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/rovo89/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/rovo89/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/rovo89/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/rovo89/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/rovo89/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"jfeinstein10\",\n" +
            "      \"id\": 1269143,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/1269143?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/jfeinstein10\",\n" +
            "      \"html_url\": \"https://github.com/jfeinstein10\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/jfeinstein10/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/jfeinstein10/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/jfeinstein10/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/jfeinstein10/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/jfeinstein10/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/jfeinstein10/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/jfeinstein10/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/jfeinstein10/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/jfeinstein10/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"SimonVT\",\n" +
            "      \"id\": 549365,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/549365?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/SimonVT\",\n" +
            "      \"html_url\": \"https://github.com/SimonVT\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/SimonVT/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/SimonVT/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/SimonVT/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/SimonVT/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/SimonVT/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/SimonVT/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/SimonVT/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/SimonVT/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/SimonVT/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    },\n" +
            "    {\n" +
            "      \"login\": \"shiffman\",\n" +
            "      \"id\": 191758,\n" +
            "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/191758?v=3\",\n" +
            "      \"gravatar_id\": \"\",\n" +
            "      \"url\": \"https://api.github.com/users/shiffman\",\n" +
            "      \"html_url\": \"https://github.com/shiffman\",\n" +
            "      \"followers_url\": \"https://api.github.com/users/shiffman/followers\",\n" +
            "      \"following_url\": \"https://api.github.com/users/shiffman/following{/other_user}\",\n" +
            "      \"gists_url\": \"https://api.github.com/users/shiffman/gists{/gist_id}\",\n" +
            "      \"starred_url\": \"https://api.github.com/users/shiffman/starred{/owner}{/repo}\",\n" +
            "      \"subscriptions_url\": \"https://api.github.com/users/shiffman/subscriptions\",\n" +
            "      \"organizations_url\": \"https://api.github.com/users/shiffman/orgs\",\n" +
            "      \"repos_url\": \"https://api.github.com/users/shiffman/repos\",\n" +
            "      \"events_url\": \"https://api.github.com/users/shiffman/events{/privacy}\",\n" +
            "      \"received_events_url\": \"https://api.github.com/users/shiffman/received_events\",\n" +
            "      \"type\": \"User\",\n" +
            "      \"site_admin\": false,\n" +
            "      \"score\": 1.0\n" +
            "    }\n" +
            "  ]" +
            "}";

    public static String responseJsonPage2 = "{\n" +
            "\t\"items\": [{\n" +
            "\t\t\"login\": \"nostra13\",\n" +
            "\t\t\"id\": 1223348,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/1223348?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/nostra13\",\n" +
            "\t\t\"html_url\": \"https://github.com/nostra13\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/nostra13/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/nostra13/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/nostra13/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/nostra13/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/nostra13/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/nostra13/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/nostra13/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/nostra13/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/nostra13/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"slidenerd\",\n" +
            "\t\t\"id\": 5139030,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/5139030?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/slidenerd\",\n" +
            "\t\t\"html_url\": \"https://github.com/slidenerd\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/slidenerd/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/slidenerd/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/slidenerd/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/slidenerd/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/slidenerd/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/slidenerd/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/slidenerd/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/slidenerd/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/slidenerd/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"kesenhoo\",\n" +
            "\t\t\"id\": 1456490,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/1456490?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/kesenhoo\",\n" +
            "\t\t\"html_url\": \"https://github.com/kesenhoo\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/kesenhoo/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/kesenhoo/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/kesenhoo/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/kesenhoo/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/kesenhoo/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/kesenhoo/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/kesenhoo/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/kesenhoo/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/kesenhoo/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"swankjesse\",\n" +
            "\t\t\"id\": 133019,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/133019?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/swankjesse\",\n" +
            "\t\t\"html_url\": \"https://github.com/swankjesse\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/swankjesse/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/swankjesse/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/swankjesse/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/swankjesse/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/swankjesse/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/swankjesse/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/swankjesse/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/swankjesse/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/swankjesse/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"GrahamCampbell\",\n" +
            "\t\t\"id\": 2829600,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/2829600?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/GrahamCampbell\",\n" +
            "\t\t\"html_url\": \"https://github.com/GrahamCampbell\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/GrahamCampbell/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/GrahamCampbell/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/GrahamCampbell/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/GrahamCampbell/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/GrahamCampbell/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/GrahamCampbell/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/GrahamCampbell/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/GrahamCampbell/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/GrahamCampbell/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"mcxiaoke\",\n" +
            "\t\t\"id\": 464330,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/464330?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/mcxiaoke\",\n" +
            "\t\t\"html_url\": \"https://github.com/mcxiaoke\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/mcxiaoke/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/mcxiaoke/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/mcxiaoke/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/mcxiaoke/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/mcxiaoke/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/mcxiaoke/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/mcxiaoke/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/mcxiaoke/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/mcxiaoke/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"ManuelPeinado\",\n" +
            "\t\t\"id\": 2700015,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/2700015?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/ManuelPeinado\",\n" +
            "\t\t\"html_url\": \"https://github.com/ManuelPeinado\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/ManuelPeinado/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/ManuelPeinado/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/ManuelPeinado/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/ManuelPeinado/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/ManuelPeinado/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/ManuelPeinado/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/ManuelPeinado/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/ManuelPeinado/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/ManuelPeinado/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"android10\",\n" +
            "\t\t\"id\": 1360604,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/1360604?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/android10\",\n" +
            "\t\t\"html_url\": \"https://github.com/android10\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/android10/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/android10/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/android10/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/android10/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/android10/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/android10/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/android10/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/android10/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/android10/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"dodola\",\n" +
            "\t\t\"id\": 1026848,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/1026848?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/dodola\",\n" +
            "\t\t\"html_url\": \"https://github.com/dodola\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/dodola/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/dodola/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/dodola/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/dodola/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/dodola/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/dodola/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/dodola/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/dodola/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/dodola/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"donnfelker\",\n" +
            "\t\t\"id\": 91827,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/91827?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/donnfelker\",\n" +
            "\t\t\"html_url\": \"https://github.com/donnfelker\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/donnfelker/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/donnfelker/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/donnfelker/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/donnfelker/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/donnfelker/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/donnfelker/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/donnfelker/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/donnfelker/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/donnfelker/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"mikepenz\",\n" +
            "\t\t\"id\": 1476232,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/1476232?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/mikepenz\",\n" +
            "\t\t\"html_url\": \"https://github.com/mikepenz\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/mikepenz/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/mikepenz/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/mikepenz/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/mikepenz/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/mikepenz/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/mikepenz/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/mikepenz/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/mikepenz/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/mikepenz/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"gabrielemariotti\",\n" +
            "\t\t\"id\": 2583078,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/2583078?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/gabrielemariotti\",\n" +
            "\t\t\"html_url\": \"https://github.com/gabrielemariotti\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/gabrielemariotti/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/gabrielemariotti/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/gabrielemariotti/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/gabrielemariotti/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/gabrielemariotti/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/gabrielemariotti/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/gabrielemariotti/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/gabrielemariotti/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/gabrielemariotti/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"joshlong\",\n" +
            "\t\t\"id\": 54473,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/54473?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/joshlong\",\n" +
            "\t\t\"html_url\": \"https://github.com/joshlong\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/joshlong/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/joshlong/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/joshlong/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/joshlong/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/joshlong/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/joshlong/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/joshlong/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/joshlong/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/joshlong/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"karan\",\n" +
            "\t\t\"id\": 3261985,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/3261985?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/karan\",\n" +
            "\t\t\"html_url\": \"https://github.com/karan\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/karan/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/karan/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/karan/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/karan/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/karan/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/karan/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/karan/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/karan/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/karan/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"afollestad\",\n" +
            "\t\t\"id\": 1820165,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/1820165?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/afollestad\",\n" +
            "\t\t\"html_url\": \"https://github.com/afollestad\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/afollestad/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/afollestad/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/afollestad/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/afollestad/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/afollestad/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/afollestad/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/afollestad/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/afollestad/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/afollestad/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"litesuits\",\n" +
            "\t\t\"id\": 3939305,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/3939305?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/litesuits\",\n" +
            "\t\t\"html_url\": \"https://github.com/litesuits\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/litesuits/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/litesuits/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/litesuits/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/litesuits/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/litesuits/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/litesuits/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/litesuits/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/litesuits/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/litesuits/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"lucasr\",\n" +
            "\t\t\"id\": 730395,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/730395?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/lucasr\",\n" +
            "\t\t\"html_url\": \"https://github.com/lucasr\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/lucasr/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/lucasr/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/lucasr/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/lucasr/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/lucasr/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/lucasr/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/lucasr/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/lucasr/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/lucasr/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"emilsjolander\",\n" +
            "\t\t\"id\": 1525924,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/1525924?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/emilsjolander\",\n" +
            "\t\t\"html_url\": \"https://github.com/emilsjolander\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/emilsjolander/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/emilsjolander/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/emilsjolander/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/emilsjolander/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/emilsjolander/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/emilsjolander/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/emilsjolander/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/emilsjolander/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/emilsjolander/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"antoniolg\",\n" +
            "\t\t\"id\": 2178243,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/2178243?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/antoniolg\",\n" +
            "\t\t\"html_url\": \"https://github.com/antoniolg\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/antoniolg/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/antoniolg/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/antoniolg/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/antoniolg/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/antoniolg/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/antoniolg/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/antoniolg/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/antoniolg/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/antoniolg/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}, {\n" +
            "\t\t\"login\": \"sephiroth74\",\n" +
            "\t\t\"id\": 823858,\n" +
            "\t\t\"avatar_url\": \"https://avatars.githubusercontent.com/u/823858?v=3\",\n" +
            "\t\t\"gravatar_id\": \"\",\n" +
            "\t\t\"url\": \"https://api.github.com/users/sephiroth74\",\n" +
            "\t\t\"html_url\": \"https://github.com/sephiroth74\",\n" +
            "\t\t\"followers_url\": \"https://api.github.com/users/sephiroth74/followers\",\n" +
            "\t\t\"following_url\": \"https://api.github.com/users/sephiroth74/following{/other_user}\",\n" +
            "\t\t\"gists_url\": \"https://api.github.com/users/sephiroth74/gists{/gist_id}\",\n" +
            "\t\t\"starred_url\": \"https://api.github.com/users/sephiroth74/starred{/owner}{/repo}\",\n" +
            "\t\t\"subscriptions_url\": \"https://api.github.com/users/sephiroth74/subscriptions\",\n" +
            "\t\t\"organizations_url\": \"https://api.github.com/users/sephiroth74/orgs\",\n" +
            "\t\t\"repos_url\": \"https://api.github.com/users/sephiroth74/repos\",\n" +
            "\t\t\"events_url\": \"https://api.github.com/users/sephiroth74/events{/privacy}\",\n" +
            "\t\t\"received_events_url\": \"https://api.github.com/users/sephiroth74/received_events\",\n" +
            "\t\t\"type\": \"User\",\n" +
            "\t\t\"site_admin\": false,\n" +
            "\t\t\"score\": 1.0\n" +
            "\t}]\n" +
            "}";
}
