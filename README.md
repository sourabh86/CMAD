# CMAD
# Architecture
# Rest APIs
- POST /api/v1/user {Creates a new user with provided data. Needs Username and email to create a new user}
- GET /api/v1/user/{userid} {Gets details of the the user with provided id}
- POST /api/v1/login {logs in a user with credentials provided as params. This should just create a JWT token and respond.}
- GET /api/v1/user/{userId}/post{Gets most recent posts by the user. All posts if no username is supplied. Should we accept userid or username for this?}
- GET /api/v1/post {Get all the posts from all users}
- POST /api/v1/post {Submit a new blog entry. Accepts username,title,tags and blogData as params}
- GET /api/v1/post/{postid} {Gets the blog with provided id}
- GET /api/v1/post?key={searchTerm} {get a list of blogs containing the searchTerm in title/content}
- PUT /api/v1/post/{postid} {Updates the post with new data}
- GET /api/v1/post/{postid}/comments {Gets all the comments for this blog post}
- POST /api/v1/post/{postid}/comments {Post a new comment to a blog. Accepts userId and comment data as params}
- PUT /api/v1/user/{userid} {Update user profile data}

# Mockup Screens


# Use cases
* Login
* Sign/Signup facility
* Show all blogs to visitors
* For authors, show all blogs of that particular author.
* Author should be able to post a blog with title/author/date/likes/comment and blog description
* Any user/visitor can search for a blog
* Comments only by logged in people.
* Author should be able to edit a blog
* Created time of blogs and any comments followed by  should be shown 
 
