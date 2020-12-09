import React from "react"
import SEO from "../components/seo"
import Default from "../components/default"
import oopLecture.Post from "../components/post"


const NotFoundPage = () => (
  <>
	<SEO title="404: Page Not Found" />
  	<Default/>
  	<oopLecture.Post title="404 Page">
    	<p>Nothing found! Try again.</p>
    </oopLecture.Post>
  </>
)

export default NotFoundPage
