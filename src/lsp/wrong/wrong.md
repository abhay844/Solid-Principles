Problem statement:
1. We have a base class SocialMedia which is having four methods chatWithFriends(), publishPost(), groupVideoCall(),
sendPhotosAndVideos()
2. Let us say we have 3 subclass for SocialMedia Facebook, WhatsApp and Instagram.
   a. In case of Instagram groupVideoCall() functionality is not supported therefore we can say it not a child of
      SocialMedia class and thus violating the Liskov substitution principle.
   b. In case of WhatsApp we can not publish post so it is also not child of SocialMedia class therefore violating
      Liskov substitution principle.

Solution:
1. We have created three interfaces SocialMedia, VideoCallManager and PostMediaManager and each class can use multiple
    interfaces to use the functionality and therefore fulfilling Liskov substitution principle.