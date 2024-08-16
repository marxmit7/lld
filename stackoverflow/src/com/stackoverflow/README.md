### class designs

UserType 
    - MEMBER
    - GUEST

User 
    - userId
    - name
    - email
    - ph
    - Role
    - searchQuestions()
    - viewQuestionDetails()

Guest --> User
    - search()
    - viewQuestionDetail()

Member --> user
    - reputation
    - List<Badge>
    - postQuestion()
    - addAnswer()
    - addComment()
    - upvoteContent()
    - flagContent()
    - addBounty()
    - earnBadge()

Moderator --> Member 
    - closeQuestion()
    - reopenQuestion()
    - deleteQuestion()
    - undeleteQuestion()

Admin --> User 
    - blockMember()
    - unblockMember()


User
    - userId
    - UserType
    - badgeList

Badge:
    - badgeId
    - badgeName

Post
    - id
    - description
    - content
    - userId
    - upvote
    - downvotes
    - postStatus

Answer --> Post
    - quesitonId

Question --> Post
    - title
    - description
    - tags
    - bounty


contentType
    - QUESTION
    - ANSWER
    - COMMENT

postStatus
    - Active
    - Closed
    - flagged 
    - deleted

