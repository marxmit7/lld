
## Stackoverflow 

problem statement 

```
Any non-member (guest) can search and view questions. However, to add or upvote a question, they have to become a member.
Members should be able to post new questions.
Members should be able to add an answer to an open question.
Members can add comments to any question or answer.
A member can upvote a question, answer or comment.
Members can flag (i.e, report as spam or abuse or off-topic) a question, answer or comment, for serious problems or moderator attention.
Any member can add a bounty to their question to draw attention.
Moderators and admins can close or reopen any question.
Members can add tags to their questions. A tag is a word or phrase that describes the topic of the question.
Moderators and admins can close a question.
Admins can block (ban) or unblock a member if the member's behavior id deemed non-compliant to the community rules.

```

Actors:
- Guest : Anyone can search and view questions
- Members : Registered Members can perform all activities that guests can, in addition to which they can add/remove questions, answers, and comments. Members can delete and un-delete their questions, answers or comments.
- Moderators : In addition to all the activities that registered users can perform, moderators can close any question.
- Admin : n addition to all the activities that registered users can perform, an admins can block or unblock members.



```
1. javac -d target src/**/*.java
2. java -cp target com.stackoverflow.Main
```