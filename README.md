# CMAD
# Architecture
# Rest APIs
- POST /api/user {Creates a new user with provided data. Needs Username and email to create a new user}
- GET /api/user?id={id} {Gets details of the the user with provided id}
- POST /api/login {logs in a user with credentials provided as params. This should just create a JWT token and respond.}
- GET /api/posts?username={username} {Gets most recent posts by the user. All posts if no username is supplied. Should we accept userid or username for this?}
- POST /api/post {Submit a new blog entry. Accepts username,title,tags and blogData as params}
- GET /api/posts?id={id} {Gets the blog with provided id}
- GET /api/posts?key={searchTerm} {get a list of blogs containing the searchTerm in title/content}
- DELETE /api/posts?id={id} {Deletes the post with provided id}
- UPDATE /api/posts?id={id} {Updates the post with new data}
- GET /api/comments?blogId={id} {Gets all the comments for this blog post}
- POST /api/comments {Post a new comment to a blog. Accepts userId and comment data as params}
- DELETE /api/comments?id={id} {Delete the comment with given ID.should we give an option to delete a comment right now?}
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
 
